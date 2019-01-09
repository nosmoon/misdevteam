/***************************************************************************************************
 * 파일명   : SP_SS_L_WRKHIST_INIT
 * 기능     : 관리자-작업-작업이력-초기화면
 * 작성일자 : 2007/05/18
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
**  SP_SS_L_WRKHIST_INIT
**/

public class SS_L_WRKHIST_INITWRKLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String id;
	public String descri;
	public String cycl;
	public String pgmnm;

	public SS_L_WRKHIST_INITWRKLISTRecord(){}

	public void setId(String id){
		this.id = id;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setCycl(String cycl){
		this.cycl = cycl;
	}

	public void setPgmnm(String pgmnm){
		this.pgmnm = pgmnm;
	}

	public String getId(){
		return this.id;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getCycl(){
		return this.cycl;
	}

	public String getPgmnm(){
		return this.pgmnm;
	}
}

/* 작성시간 : Fri May 18 15:04:48 KST 2007 */