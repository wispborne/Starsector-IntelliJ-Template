package author.modname;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;

public class TemplateModPlugin extends BaseModPlugin {
    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();

        // Test that the .jar is loaded and working, using the most obnoxious way possible.
        throw new RuntimeException("Template mod loaded and working!\nRemove this crash in TemplateModPlugin.");
    }

    @Override
    public void onNewGame() {
        super.onNewGame();
        // Add your code here, or delete this method (it does nothing unless you add code)
    }

    // You can add more methods from ModPlugin here. Press Control-O in IntelliJ to see options.
}
