package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.enterprise.features.trpr.TrPrModule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class AppTrPrModule extends TrPrModule {

    @Override
    public String schema() {
        return this.schema = "pt_maintenance";
    }
}
