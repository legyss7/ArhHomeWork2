package org.lesson2.factorymethod;

import org.lesson2.templatemethod.LogReader;
import org.lesson2.templatemethod.PoemReader;

public class ConcreteReaderCreator extends BaseLogReaderCreator {
    @Override
    protected LogReader createLogReaderInstance(LogType logType) {

        return switch (logType) {
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case Database -> new DatabaseReader();
            case System -> new OperationSystemLogEventReader();
        };
    }
}
