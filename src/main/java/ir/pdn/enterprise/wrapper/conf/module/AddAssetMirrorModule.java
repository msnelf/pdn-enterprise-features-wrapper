package ir.pdn.enterprise.wrapper.conf.module;

import ir.pdn.portal.mirrorasset.AssetMirrorModule;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class AddAssetMirrorModule extends AssetMirrorModule {

    @Override
    public String schema() {
        return "pt_maintenance";
    }
}
