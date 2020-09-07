import java.lang.reflect.Constructor;

class Runner {
    public static void main(String[] args) throws Throwable {
        Class cl = Class.forName(new String(createClassName()));
        Constructor constructor = cl.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object object = constructor.newInstance("JavaStart");
        object.getClass().getDeclaredMethod("show").invoke(object);

    }

    private static StringBuilder createClassName(){
        int[] name = {84, 114, 105, 99, 107, 121};
        StringBuilder stringBuilder = new StringBuilder();
        for (int ch: name) {
            stringBuilder.append((char) ch);
        }
        return stringBuilder;
    }
}
