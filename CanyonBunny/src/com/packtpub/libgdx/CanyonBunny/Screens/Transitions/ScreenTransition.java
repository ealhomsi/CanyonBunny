package com.packtpub.libgdx.CanyonBunny.Screens.Transitions;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface ScreenTransition {
	public float getDuration();
	public void render(SpriteBatch batch, Texture curScreen, Texture nextScreen, float alpha);
}
