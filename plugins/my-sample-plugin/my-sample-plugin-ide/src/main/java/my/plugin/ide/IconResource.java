package my.plugin.ide;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import org.vectomatic.dom.svg.ui.SVGResource;

/**
 * Created by stefan on 26.06.17.
 */
public interface IconResource extends ClientBundle {
    IconResource INSTANCE = GWT.create(IconResource.class);

    @Source("icon.svg")
    SVGResource icon();
}
