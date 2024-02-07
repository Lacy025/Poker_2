package rs.baci.Poker_2;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

class MyDefaultMetalTheme extends DefaultMetalTheme {
  public ColorUIResource getWindowTitleInactiveBackground() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getWindowTitleBackground() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getPrimaryControlHighlight() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getPrimaryControlDarkShadow() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getPrimaryControl() {
    return new ColorUIResource(java.awt.Color.white);
  }
  public ColorUIResource getControlHighlight() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getControlDarkShadow() {
    return new ColorUIResource(java.awt.Color.black);
  }
  public ColorUIResource getControl() {
    return new ColorUIResource(java.awt.Color.black);
  }
}