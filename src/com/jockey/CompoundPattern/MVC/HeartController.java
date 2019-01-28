package com.jockey.CompoundPattern.MVC;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;
	
	public HeartController(HeartModelInterface model) {
		super();
		this.model = model;
		view = new DJView(new HeartAdapter(model),this);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	@Override
	public void start() {
		model.start();
	}

	@Override
	public void stop() {}

	@Override
	public void increaseBPM() {}

	@Override
	public void decreaseBPM() {}

	@Override
	public void setBPM(int bpm) {}

}
