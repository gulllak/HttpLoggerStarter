package ru.evgenii.httplogger.httploggerspringbootstarter.init;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import ru.evgenii.httplogger.httploggerspringbootstarter.exception.LoggingStartupException;

public class LoggingFailureAnalyzer extends AbstractFailureAnalyzer<LoggingStartupException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, LoggingStartupException cause) {
        return new FailureAnalysis(cause.getMessage(),
                "Укажите верные значения для свойства в файле конфигурации. Допустимые значения: true или false.",
                cause);
    }
}
