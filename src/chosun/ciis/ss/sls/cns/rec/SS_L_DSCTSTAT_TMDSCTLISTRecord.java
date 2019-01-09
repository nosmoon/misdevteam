/***************************************************************************************************
* 파일명 : SS_L_DSCTSTAT_TMDSCTLISTRecord.java
* 기능 : 상담원-불편통계를 위한 Record
* 작성일자 : 2004-07-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.rec;

import java.sql.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.ds.*;

/**
 * 상담원-불편통계를 위한 Record
 */


public class SS_L_DSCTSTAT_TMDSCTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dscttypecd;
	public String gubun;
	public String dscttypenm;
	public int col1;
	public int col2;
	public int col3;
	public int col4;
	public int col5;
	public int col6;
	public int col7;
	public int col8;
	public int col9;
	public int col10;
	public int col11;

	public SS_L_DSCTSTAT_TMDSCTLISTRecord(){}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setDscttypenm(String dscttypenm){
		this.dscttypenm = dscttypenm;
	}

	public void setCol1(int col1){
		this.col1 = col1;
	}

	public void setCol2(int col2){
		this.col2 = col2;
	}

	public void setCol3(int col3){
		this.col3 = col3;
	}

	public void setCol4(int col4){
		this.col4 = col4;
	}

	public void setCol5(int col5){
		this.col5 = col5;
	}

	public void setCol6(int col6){
		this.col6 = col6;
	}

	public void setCol7(int col7){
		this.col7 = col7;
	}

	public void setCol8(int col8){
		this.col8 = col8;
	}

	public void setCol9(int col9){
		this.col9 = col9;
	}

	public void setCol10(int col10){
		this.col10 = col10;
	}

	public void setCol11(int col11){
		this.col11 = col11;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getDscttypenm(){
		return this.dscttypenm;
	}

	public int getCol1(){
		return this.col1;
	}

	public int getCol2(){
		return this.col2;
	}

	public int getCol3(){
		return this.col3;
	}

	public int getCol4(){
		return this.col4;
	}

	public int getCol5(){
		return this.col5;
	}

	public int getCol6(){
		return this.col6;
	}

	public int getCol7(){
		return this.col7;
	}

	public int getCol8(){
		return this.col8;
	}

	public int getCol9(){
		return this.col9;
	}

	public int getCol10(){
		return this.col10;
	}

	public int getCol11(){
		return this.col11;
	}
}

/* 작성시간 : Fri Jul 23 20:54:08 KST 2004 */