/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String chrg_pers_nm;
	public String feat_clsf;
	public String col1;
	public String col2;
	public String col3;
	public String col4;
	public String col5;
	public String col6;
	public String col7;
	public String col8;
	public String col9;
	public String col10;
	public String col11;
	public String col12;
	public String col13;
	public String col14;
	public String col15;
	public String col16;
	public String col17;
	public String col18;
	public String col19;
	public String col20;
	public String col21;
	public String col22;
	public String col23;
	public String col24;
	public String col25;
	public String col26;
	public String col27;

	public SE_TRG_1310_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setFeat_clsf(String feat_clsf){
		this.feat_clsf = feat_clsf;
	}

	public void setCol1(String col1){
		this.col1 = col1;
	}

	public void setCol2(String col2){
		this.col2 = col2;
	}

	public void setCol3(String col3){
		this.col3 = col3;
	}

	public void setCol4(String col4){
		this.col4 = col4;
	}

	public void setCol5(String col5){
		this.col5 = col5;
	}

	public void setCol6(String col6){
		this.col6 = col6;
	}

	public void setCol7(String col7){
		this.col7 = col7;
	}

	public void setCol8(String col8){
		this.col8 = col8;
	}

	public void setCol9(String col9){
		this.col9 = col9;
	}

	public void setCol10(String col10){
		this.col10 = col10;
	}

	public void setCol11(String col11){
		this.col11 = col11;
	}

	public void setCol12(String col12){
		this.col12 = col12;
	}

	public void setCol13(String col13){
		this.col13 = col13;
	}

	public void setCol14(String col14){
		this.col14 = col14;
	}

	public void setCol15(String col15){
		this.col15 = col15;
	}

	public void setCol16(String col16){
		this.col16 = col16;
	}

	public void setCol17(String col17){
		this.col17 = col17;
	}

	public void setCol18(String col18){
		this.col18 = col18;
	}

	public void setCol19(String col19){
		this.col19 = col19;
	}

	public void setCol20(String col20){
		this.col20 = col20;
	}

	public void setCol21(String col21){
		this.col21 = col21;
	}

	public void setCol22(String col22){
		this.col22 = col22;
	}

	public void setCol23(String col23){
		this.col23 = col23;
	}

	public void setCol24(String col24){
		this.col24 = col24;
	}

	public void setCol25(String col25){
		this.col25 = col25;
	}

	public void setCol26(String col26){
		this.col26 = col26;
	}

	public void setCol27(String col27){
		this.col27 = col27;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getFeat_clsf(){
		return this.feat_clsf;
	}

	public String getCol1(){
		return this.col1;
	}

	public String getCol2(){
		return this.col2;
	}

	public String getCol3(){
		return this.col3;
	}

	public String getCol4(){
		return this.col4;
	}

	public String getCol5(){
		return this.col5;
	}

	public String getCol6(){
		return this.col6;
	}

	public String getCol7(){
		return this.col7;
	}

	public String getCol8(){
		return this.col8;
	}

	public String getCol9(){
		return this.col9;
	}

	public String getCol10(){
		return this.col10;
	}

	public String getCol11(){
		return this.col11;
	}

	public String getCol12(){
		return this.col12;
	}

	public String getCol13(){
		return this.col13;
	}

	public String getCol14(){
		return this.col14;
	}

	public String getCol15(){
		return this.col15;
	}

	public String getCol16(){
		return this.col16;
	}

	public String getCol17(){
		return this.col17;
	}

	public String getCol18(){
		return this.col18;
	}

	public String getCol19(){
		return this.col19;
	}

	public String getCol20(){
		return this.col20;
	}

	public String getCol21(){
		return this.col21;
	}

	public String getCol22(){
		return this.col22;
	}

	public String getCol23(){
		return this.col23;
	}

	public String getCol24(){
		return this.col24;
	}

	public String getCol25(){
		return this.col25;
	}

	public String getCol26(){
		return this.col26;
	}

	public String getCol27(){
		return this.col27;
	}
}

/* 작성시간 : Mon Aug 24 20:42:51 KST 2009 */