import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class My_Plugin implements PlugIn {

	public void run(String arg) {
		imageCalculator("Subtract create", "20210422_before_original.png","20210427_after_original.png");
		selectWindow("Result of 20210422_before_original.png");
		run("Split Channels");
		imageCalculator("Subtract create", "Result of 20210422_before_original.png (red)","Result of 20210422_before_original.png (blue)");
		selectWindow("Result of Result of 20210422_before_original.png (red)");
		setAutoThreshold("Default dark");
		//run("Threshold...");
		//setThreshold(54, 255);
		setOption("BlackBackground", false);
		run("Convert to Mask");
		run("Watershed");
		run("Analyze Particles...", "size=100-Infinity display clear summarize add");
		selectWindow("20210427_after_original.png");
		roiManager("Show None");
		roiManager("Show All without labels");
		selectWindow("20210422_before_original.png");
		roiManager("Show All");
		roiManager("Show All without labels");
	}

}
