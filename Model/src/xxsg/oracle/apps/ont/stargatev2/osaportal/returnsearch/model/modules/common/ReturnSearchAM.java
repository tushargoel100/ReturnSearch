package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.model.modules.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 20 17:13:51 IST 2016
// ---------------------------------------------------------------------
public interface ReturnSearchAM extends ApplicationModule {
    void init();

    void resetAction();

    void searchAction();

    void throwException(String message);

    void executeEmptyRowset();
}
