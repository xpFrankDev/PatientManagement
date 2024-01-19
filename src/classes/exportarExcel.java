package Clases;

/*
*REQUIERE JAR  - POI3.9
*
*REQUIERE JAR  - POI3.9
*REQUIERE JAR  - POI3.9
*
*REQUIERE JAR  - POI3.9
*REQUIERE JAR  - POI3.9
 */




import rojerusan.RSTableMetro;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;


/**
 *
 * @author soporte
 * 
 * REQUIERE JAR  - POI3.9
 */
public class exportarExcel {

    public static void main(String[] args) {
       
        try {
            JTable t = new JTable();
            DefaultTableModel model = (DefaultTableModel) t.getModel();
            int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
            String fecha01 = new SimpleDateFormat("yyyy-MM-dd").format(new tools().getCurrYearFirst(ano)).toString();
            
            Calendar fechaInicialCalendar = Calendar.getInstance();
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fecha01);
            fechaInicialCalendar.setTime(fecha);
            ArrayList<String> fechas = new ArrayList();
            
            fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, -6);
            fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
            fechaInicialCalendar.set(Calendar.DAY_OF_MONTH, fechaInicialCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
            
            for(int i=0; i<12;i++){
                for(int j=1; j<5;j++){
                    if(j==1 && i>0){
                        
                        fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, 1);
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
                        fechaInicialCalendar.set(Calendar.DAY_OF_MONTH , fechaInicialCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
            
                    }else if(j==2){
                        fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, 1);
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
                        fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, 6);
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
                    }else if(j==3 || j==4){
                        fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, 1);
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
                        fechaInicialCalendar.add(Calendar.DAY_OF_YEAR, 8);
                        fechas.add(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicialCalendar.getTime()));
                    }
                }
            }
            
            t = new JTable();
            model = (DefaultTableModel) t.getModel();
            model.addColumn("N°");
            model.addColumn("Usuario/a y/o Paciente");
            for(int i=0; i<fechas.size();i++){
                model.addColumn(fechas.get(i++).substring(8, 10) +" al "+fechas.get(i).substring(8, 10));
            }
            model.addColumn("Totales por Usuarios");
            model.addRow(new Object[]{"1","User1"});
            model.addRow(new Object[]{"2","User2"});
        } catch (ParseException ex) {
            Logger.getLogger(exportarExcel.class.getName()).log(Level.SEVERE, null, ex);
        }    
            
    }

    public  void exportarExcelGGP(JTable t, String titulo) throws IOException {
        String fecha = new SimpleDateFormat("dd-MM-yyyy hh.mm.ss").format(new Date());
        
        String ruta="";
        
        
        
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            String x =System.getProperty("user.name") ;
            ruta = "C:\\DataCaps\\Reportes\\"+titulo+" "+ fecha+".xls"; 
        }else{
            ruta = new File(".").getAbsolutePath()+titulo+" "+ fecha+".xls";
        }
        
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                
                CellStyle EstiloTitulo = libro.createCellStyle();
                EstiloTitulo.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                EstiloTitulo.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                EstiloTitulo.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                EstiloTitulo.setBorderTop(HSSFCellStyle.BORDER_THIN);
                EstiloTitulo.setBorderRight(HSSFCellStyle.BORDER_THIN);
                EstiloTitulo.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle EstiloDatos = libro.createCellStyle();
                EstiloDatos.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                EstiloDatos.setBorderTop(HSSFCellStyle.BORDER_THIN);
                EstiloDatos.setBorderRight(HSSFCellStyle.BORDER_THIN);
                EstiloDatos.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                
                
               
                int x1 =2,x2=5;
                Row rowF = hoja.createRow(0);
                for(int i=1; i<13;i++){
                     
                     Cell cell = rowF.createCell(x1);
                     cell.setCellValue (new tools().getMes(i));
                     hoja.addMergedRegion(new CellRangeAddress(0, 0, x1, x2));
                     
                     cell.setCellStyle(EstiloDatos);
                     CellUtil.setAlignment(cell, libro, CellStyle.ALIGN_CENTER);
                     x1+=4;
                     x2+=4;
                }
                
                
               Row row = hoja.createRow(1);
                int x =2;
                for(int i=0;i<12;i++){
                    for(int j=1;j<5;j++){
                        Cell cell = row.createCell(x++);
                        cell.setCellValue (j);
                        
                        cell.setCellStyle(EstiloDatos);
                        CellUtil.setAlignment(cell, libro, CellStyle.ALIGN_CENTER);
                    }
                }
                
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f+2);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celdaColumna = fila.createCell(c);
                        if (f == 0) {
                            celdaColumna.setCellValue(t.getColumnName(c));
                            celdaColumna.setCellStyle(EstiloTitulo);
                            CellUtil.setAlignment(celdaColumna, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                int filaInicio = 3;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celdaDato = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celdaDato.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celdaDato.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celdaDato.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        
                        celdaDato.setCellStyle(EstiloDatos);
                        CellUtil.setAlignment(celdaDato, libro, CellStyle.ALIGN_CENTER);
                    }
                }
                
                
                int finalTabla = (t.getRowCount()+2);
                x1=2;x2=5;
                for(int i=1; i<13;i++){
                   hoja.addMergedRegion(new CellRangeAddress(finalTabla, finalTabla, x1, x2));
                     x1+=4;
                     x2+=4; 
                }
                
                

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
             
        }
    
    
    
    
    
    public void exportarExcel(RSTableMetro t, String titulo) throws IOException  {
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        String ruta="";
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            String x =System.getProperty("user.name") ;
            ruta = "C:\\DataCaps\\Reportes\\"+titulo+" "+ fecha+".xls"; 
        }else{
            ruta = new File(".").getAbsolutePath()+titulo+" "+ fecha+".xls";
        }
        //new File(".").getAbsolutePath()
               
            try {
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                CellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle style2 = libro.createCellStyle();
                style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                            celda.setCellStyle(style);
                            CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        
                        celda.setCellStyle(style2);
                        CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                    }
                }

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    
    public void exportarExcel(JTable t, String titulo) throws IOException {
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        String ruta="";
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            String x =System.getProperty("user.name") ;
            ruta = "C:\\DataCaps\\Reportes\\"+titulo+" "+ fecha+".xls"; 
        }else{
            ruta = new File(".").getAbsolutePath()+titulo+" "+ fecha+".xls";
        }
        //new File(".").getAbsolutePath()
               
            try {
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                CellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle style2 = libro.createCellStyle();
                style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                            celda.setCellStyle(style);
                            CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        
                        celda.setCellStyle(style2);
                        CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                    }
                }

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
}
