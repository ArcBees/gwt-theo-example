/**
 * -> WARNING, this is a generated file. Use GWT-Theo if you want to modify it.
 */

package com.arcbees.gwttheo.example.client.resources.theme;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource;

public interface ThemeResources extends ClientBundle {
	interface Icons extends CssResource {
		String icon_github();

		String icon_heart();
	}

	@Source("fonts/icons/icons.ttf")
	DataResource iconsTtf();

	@Source("fonts/icons/icons.eot")
	DataResource iconsEot();

	@Source("fonts/icons/icons.svg")
	DataResource iconsSvg();

	@Source("fonts/icons/icons.woff")
	DataResource iconsWoff();

	@Source("fonts/icons/icons.gss")
	Icons icons();
}
