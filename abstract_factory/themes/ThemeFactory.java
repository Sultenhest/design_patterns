package abstract_factory.themes;

import abstract_factory.themes.dark.DarkTheme;
import abstract_factory.themes.light.LightTheme;

public class ThemeFactory {
    public Theme getTheme(boolean darkmode) {
        if( darkmode ) {
            return new DarkTheme();
        }
        return new LightTheme();
    }
}
