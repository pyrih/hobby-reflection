<div align="center">
<img src="https://octodex.github.com/images/dunetocat.png" width="200">
<p>This is some centered text.</p>
</div>



# hobby-reflection

# класс хобби с jar-архива
package pyrih.andrii.entities;

import pyrih.andrii.exceprions.HobbyException;

public class DefaultHobby extends AbstractHobby {
    private int privateField = 7;
    final private int finalPrivateField = 42;
    private final static int pFSF = 88;

    public DefaultHobby() {
    }

    public DefaultHobby(String name, int spentHours) {
        super(name, spentHours);
    }

    public DefaultHobby(String name, int spentHours, String description) {
        super(name, spentHours, description);
    }

    int test(int a, String b, double c) {
        String info = "a: " + a + ", b: " + b + ", c: " + c;
        return a;
    }

    @Override
    public String tellAboutHobby(int hours) throws HobbyException {
        return null;
    }

    @Override
    public String tellAboutHobby() {
        return null;
    }
}

#ВЫВОД В КОНСОЛЬ

"C:\Program Files\Java\jdk1.8.0_221\bin\java.exe" "-javaagent:C:\Program Files\JBrains\IntelliJIDEACE2019.2.4\lib\idea_rt.jar=59454:C:\Program Files\JBrains\IntelliJIDEACE2019.2.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar;C:\dev\hobby-reflection\out\production\hobby-reflection;C:\Users\Andrii\Desktop\lecture4hobby.jar" ua.andrii.pyrih.Main
AbstractHobby[name='Running', spentHours=50, description='Description...']


*** Constructors ***
public pyrih.andrii.entities.DefaultHobby(java.lang.String,int,java.lang.String)
public pyrih.andrii.entities.DefaultHobby(java.lang.String,int)
public pyrih.andrii.entities.DefaultHobby()

*** Methods ***
public java.lang.String pyrih.andrii.entities.DefaultHobby.tellAboutHobby(int) throws pyrih.andrii.exceprions.HobbyException
public java.lang.String pyrih.andrii.entities.DefaultHobby.tellAboutHobby()
public java.lang.String pyrih.andrii.entities.AbstractHobby.toString()
public java.lang.String pyrih.andrii.entities.AbstractHobby.getName()
public void pyrih.andrii.entities.AbstractHobby.setName(java.lang.String)
public java.lang.String pyrih.andrii.entities.AbstractHobby.getDescription()
public int pyrih.andrii.entities.AbstractHobby.getSpentHours()
public void pyrih.andrii.entities.AbstractHobby.setSpentHours(int)
public void pyrih.andrii.entities.AbstractHobby.setDescription(java.lang.String)
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()

*** Fields ***
Нет открытых свойств

*** Declared Fields ***
private int pyrih.andrii.entities.DefaultHobby.privateField
private final int pyrih.andrii.entities.DefaultHobby.finalPrivateField
private static final int pyrih.andrii.entities.DefaultHobby.pFSF

*** Method Invocation ***
Returned value after invoke test method: 10

*** Operations on privateField ***
Старое значение переменной: 7
Новое значение переменной: 13

*** Operations on finalPrivateField ***
Старое значение финальной переменной : 42 (Modifiers: Field is private & final)
Новое значение переменной: 47

*** Operations on finalPrivateStaticField ***
Старое значение финальной статической переменной: 88
Can not set static final int field pyrih.andrii.entities.DefaultHobby.pFSF to (int)95
Поле pFSF является файнал

Process finished with exit code 0
