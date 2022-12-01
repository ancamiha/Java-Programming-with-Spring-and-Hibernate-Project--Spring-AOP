package com.luxoft.bankapp.service.audit;

import org.springframework.stereotype.Service;

@Service
public class AuditService implements Audit {
    @Override
    public void auditDeposit(long accountId, double amount) {
        System.out.println("Deposit " + amount + " to account " + accountId);
    }

    @Override
    public void auditWithdraw(long accountId, double amount, WithdrawState state) {
        System.out.println("Withdraw " + amount + " from account " + accountId + " with state " + state);
    }

    @Override
    public void auditBalance(long accountId) {
        System.out.println("Balance for account " + accountId);
    }
}
