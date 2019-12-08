package ua.andrii.pyrih;

import pyrih.andrii.entities.DefaultHobby;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String PATH = "pyrih.andrii.entities.DefaultHobby";
        // 1
        Class clazz = null;
        try {
            clazz = Class.forName(PATH);
        } catch (ClassNotFoundException e) {
            System.out.println("Class DefaultHobby is not found!");
        }

        // 2
        Class[] parameterTypes = new Class[3];
        parameterTypes[0] = String.class;
        parameterTypes[1] = int.class;
        parameterTypes[2] = String.class;

        DefaultHobby defaultHobby = null;
        try {
            Constructor constructor = clazz.getConstructor(parameterTypes);

            defaultHobby = (DefaultHobby) constructor.newInstance("Running", 50, "Description...");
            System.out.println(defaultHobby);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 3
        Constructor[] constructors = clazz.getConstructors();
        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();

        printList("Constructors", constructors);
        printList("Methods", methods);
        printList("Fields", fields);
        printList("Declared Fields", declaredFields);

        // 4
        Class[] parameterTypes2 = new Class[3];
        parameterTypes2[0] = int.class;
        parameterTypes2[1] = String.class;
        parameterTypes2[2] = double.class;

        Method methodTest = clazz.getDeclaredMethod("test", parameterTypes2);
        methodTest.setAccessible(true);

        int fromTestMethod = (int) methodTest.invoke(defaultHobby, 10, "test", 20.5);
        System.out.println("\n*** Method Invocation ***");
        System.out.println("Returned value after invoke test method: " + fromTestMethod);

        // 5-1
        System.out.println("\n*** Operations on privateField ***");

        Field field = clazz.getDeclaredField("privateField");
        field.setAccessible(true);
        int oldValue = (int) field.getInt(defaultHobby);
        System.out.println("Старое значение переменной: " + oldValue);

        field.setAccessible(true);
        field.setInt(defaultHobby, 13);
        int newValue = (int) field.getInt(defaultHobby);
        System.out.println("Новое значение переменной: " + newValue);

        // 5-2
        System.out.println("\n*** Operations on finalPrivateField ***");
        Field f = defaultHobby.getClass().getDeclaredField("finalPrivateField");
        f.setAccessible(true);
        int oldValueF = (int) f.getInt(defaultHobby);
        System.out.print("Старое значение финальной переменной : " + oldValueF);

        int modifiers = f.getModifiers();
        if (Modifier.isPrivate(modifiers) && Modifier.isFinal(modifiers)) {
            System.out.println(" (Modifiers: Field is private & final)");
        }

        f.setAccessible(true);
        f.setInt(defaultHobby, 47);
        int newValueF = (int) f.getInt(defaultHobby);
        System.out.println("Новое значение переменной: " + newValueF);

        //5-3
        System.out.println("\n*** Operations on finalPrivateStaticField ***");
        DefaultHobby hobby = new DefaultHobby("hobby", 25, "descr.");
        Field fi = hobby.getClass().getDeclaredField("pFSF");
        fi.setAccessible(true);
        int fifi = fi.getInt(hobby);
        System.out.println("Старое значение финальной статической переменной: " + fifi);
        try {
            fi.setInt(hobby, 95);
            fifi = fi.getInt(hobby);
            System.out.println(fifi);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            System.out.println("Поле pFSF является файнал");
        }

        /*Field fil = DefaultHobby.class.getDeclaredField("pFSF");
        fil.setAccessible(true);

        Field modifiersField = fil.getClass().getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(fil, fil.getModifiers() & ~Modifier.FINAL);
        fil.setInt(null, 99);

        int newValueFS = (int) fil.getInt(null);
        System.out.println("Новое значение статической финальной переменной: " + newValueFS);*/
    }

    public static void printList(String s, Object[] o) {
        System.out.println("\n*** " + s + " ***");
        if (o.length == 0) {
            System.out.println("Нет открытых свойств");
        }
        for (int i = 0; i < o.length; i++)
            System.out.println(o[i].toString());
    }
}
