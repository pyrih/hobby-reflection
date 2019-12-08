package ua.andrii.pyrih;

import pyrih.andrii.entities.DefaultHobby;

import java.lang.reflect.*;

public class EverythingIsTrue {
    public static void main(String args[]) throws Exception {
        DefaultHobby hobby = new DefaultHobby("hobby", 25, "descr.");
        Field dHF = hobby.getClass().getDeclaredField("pFSF");
        dHF.setAccessible(true);
        int fifi = dHF.getInt(hobby);
        System.out.println("Старое значение финальной статической переменной: " + fifi);

        dHF.setAccessible(true);

        Field modifiersField = dHF.getClass().getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(dHF, dHF.getModifiers() & ~Modifier.FINAL);

        dHF.set(hobby, 102);

        dHF.setAccessible(true);

        int newValueF = (int) dHF.getInt(dHF);
        System.out.println("Новое значение переменной: " + newValueF);
    }
}
