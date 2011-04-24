/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KnightRMS;

/**
 *
 * @author Evan
 */

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class FixTextFieldLength extends PlainDocument {
  private int maxLength;
  FixTextFieldLength(int maxLength) {
    super();
    this.maxLength = maxLength;
  }
}

//  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
//    if (str == null)
//      return;
//
//    if ((getLength() + str.length()) <= maxLength) {
//      super.insertString(offset, str, attr);
//    }
//  }
//}
