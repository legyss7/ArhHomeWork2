package org.lesson2.factorymethod;

import org.lesson2.templatemethod.LogEntry;
import org.lesson2.templatemethod.LogReader;

public class Program {

    public static String data = """
            У локоморья дуб зелённый;
            Златая цепь на дубе том:
            И днем и ночью кот учённый
            Всё ходит по цепи кругом;
            Идет направо - пуснь заводит,
            Налево - сказку говорит.""";

    public static void main(String[] args) {

        LogReader logReader = new ConcreteReaderCreator()
                .createLogReader(LogType.Poem, data);
        for (LogEntry log : logReader.readLogEntry()) {
            System.out.println(log.getText());
        }

    }
}
