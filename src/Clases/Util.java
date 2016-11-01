/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erika
 */
public class Util {

    public static int booleanToInt(boolean estado) {
        if (estado) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Object[][] getTableData(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }
}
