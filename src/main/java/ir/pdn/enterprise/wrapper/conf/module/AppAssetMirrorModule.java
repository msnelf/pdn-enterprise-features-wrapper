package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.portal.mirrorasset.AssetMirrorModule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class AppAssetMirrorModule extends AssetMirrorModule {

    @Override
    public String schema() {
        return this.schema="pt_maintenance";
    }
}
