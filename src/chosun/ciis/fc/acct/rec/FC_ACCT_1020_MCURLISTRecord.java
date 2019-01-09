/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1020_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String acct_nm;
	public String menu_levl;
	public String menu_seq1;
	public String menu_seq2;
	public String menu_seq3;
	public String menu_seq4;
	public String subyn;

	public FC_ACCT_1020_MCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setMenu_levl(String menu_levl){
		this.menu_levl = menu_levl;
	}

	public void setMenu_seq1(String menu_seq1){
		this.menu_seq1 = menu_seq1;
	}

	public void setMenu_seq2(String menu_seq2){
		this.menu_seq2 = menu_seq2;
	}

	public void setMenu_seq3(String menu_seq3){
		this.menu_seq3 = menu_seq3;
	}

	public void setMenu_seq4(String menu_seq4){
		this.menu_seq4 = menu_seq4;
	}

	public void setSubyn(String subyn){
		this.subyn = subyn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getMenu_levl(){
		return this.menu_levl;
	}

	public String getMenu_seq1(){
		return this.menu_seq1;
	}

	public String getMenu_seq2(){
		return this.menu_seq2;
	}

	public String getMenu_seq3(){
		return this.menu_seq3;
	}

	public String getMenu_seq4(){
		return this.menu_seq4;
	}
	
	public String getSubyn(){
		return this.subyn;
	}
}

/* 작성시간 : Wed Jun 11 13:53:34 KST 2014 */