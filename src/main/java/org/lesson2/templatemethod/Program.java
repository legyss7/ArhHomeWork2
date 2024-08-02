package org.lesson2.templatemethod;

public class Program {

    public static String data = """
            У локоморья дуб зелённый;
            Златая цепь на дубе том:
            И днем и ночью кот учённый
            Всё ходит по цепи кругом;
            Идет направо - пуснь заводит,
            Налево - сказку говорит.""";

    public static void main(String[] args) {
        LogReader logReader = new PoemReader(data);
        logReader.setCurrentPosition(3);

        for (LogEntry log : logReader.readLogEntry()) {
            System.out.println(log.getText());
        }
    }
}
