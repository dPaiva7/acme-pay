package br.com.acmepay.application.ports.in;

import br.com.acmepay.application.domain.models.AccountDomain;

public interface ICreateNotificationUseCase {
    void execute(AccountDomain domain);
}
