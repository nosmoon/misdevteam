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


package chosun.ciis.as.redm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.ds.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1202_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String redm_yymm;
	public String aset_no;
	public String meda_amt;
	public String chg_pers;

	public AS_REDM_1202_UDM(){}
	public AS_REDM_1202_UDM(String cmpy_cd, String redm_yymm, String aset_no, String meda_amt, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.redm_yymm = redm_yymm;
		this.aset_no = aset_no;
		this.meda_amt = meda_amt;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRedm_yymm(String redm_yymm){
		this.redm_yymm = redm_yymm;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRedm_yymm(){
		return this.redm_yymm;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_REDM_1202_U(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_REDM_1202_UDM dm = (AS_REDM_1202_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.redm_yymm);
		cstmt.setString(5, dm.aset_no);
		cstmt.setString(6, dm.meda_amt);
		cstmt.setString(7, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.redm.ds.AS_REDM_1202_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("redm_yymm = [" + getRedm_yymm() + "]");
		System.out.println("aset_no = [" + getAset_no() + "]");
		System.out.println("meda_amt = [" + getMeda_amt() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String redm_yymm = req.getParameter("redm_yymm");
if( redm_yymm == null){
	System.out.println(this.toString+" : redm_yymm is null" );
}else{
	System.out.println(this.toString+" : redm_yymm is "+redm_yymm );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String meda_amt = req.getParameter("meda_amt");
if( meda_amt == null){
	System.out.println(this.toString+" : meda_amt is null" );
}else{
	System.out.println(this.toString+" : meda_amt is "+meda_amt );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String redm_yymm = Util.checkString(req.getParameter("redm_yymm"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String meda_amt = Util.checkString(req.getParameter("meda_amt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String redm_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_yymm")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String meda_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_amt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRedm_yymm(redm_yymm);
dm.setAset_no(aset_no);
dm.setMeda_amt(meda_amt);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 16:58:42 KST 2009 */