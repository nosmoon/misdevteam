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


package chosun.ciis.as.asrd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.ds.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 
 */


public class AS_ASRD_1901_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_aset_no;
	public String to_aset_no;
	public String buy_clsf;
	public String fr_dept_cd;
	public String to_dept_cd;
	public String fr_acqr_dt;
	public String to_acqr_dt;
	public String aset_no_list;
	public String aset_no_clsf;

	public AS_ASRD_1901_LDM(){}
	public AS_ASRD_1901_LDM(String cmpy_cd, String fr_aset_no, String to_aset_no, String buy_clsf, String fr_dept_cd, String to_dept_cd, String fr_acqr_dt, String to_acqr_dt, String aset_no_list, String aset_no_clsf){
		this.cmpy_cd = cmpy_cd;
		this.fr_aset_no = fr_aset_no;
		this.to_aset_no = to_aset_no;
		this.buy_clsf = buy_clsf;
		this.fr_dept_cd = fr_dept_cd;
		this.to_dept_cd = to_dept_cd;
		this.fr_acqr_dt = fr_acqr_dt;
		this.to_acqr_dt = to_acqr_dt;
		this.aset_no_list = aset_no_list;
		this.aset_no_clsf = aset_no_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_aset_no(String fr_aset_no){
		this.fr_aset_no = fr_aset_no;
	}

	public void setTo_aset_no(String to_aset_no){
		this.to_aset_no = to_aset_no;
	}

	public void setBuy_clsf(String buy_clsf){
		this.buy_clsf = buy_clsf;
	}

	public void setFr_dept_cd(String fr_dept_cd){
		this.fr_dept_cd = fr_dept_cd;
	}

	public void setTo_dept_cd(String to_dept_cd){
		this.to_dept_cd = to_dept_cd;
	}

	public void setFr_acqr_dt(String fr_acqr_dt){
		this.fr_acqr_dt = fr_acqr_dt;
	}

	public void setTo_acqr_dt(String to_acqr_dt){
		this.to_acqr_dt = to_acqr_dt;
	}

	public void setAset_no_list(String aset_no_list){
		this.aset_no_list = aset_no_list;
	}

	public void setAset_no_clsf(String aset_no_clsf){
		this.aset_no_clsf = aset_no_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_aset_no(){
		return this.fr_aset_no;
	}

	public String getTo_aset_no(){
		return this.to_aset_no;
	}

	public String getBuy_clsf(){
		return this.buy_clsf;
	}

	public String getFr_dept_cd(){
		return this.fr_dept_cd;
	}

	public String getTo_dept_cd(){
		return this.to_dept_cd;
	}

	public String getFr_acqr_dt(){
		return this.fr_acqr_dt;
	}

	public String getTo_acqr_dt(){
		return this.to_acqr_dt;
	}

	public String getAset_no_list(){
		return this.aset_no_list;
	}

	public String getAset_no_clsf(){
		return this.aset_no_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASRD_1901_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASRD_1901_LDM dm = (AS_ASRD_1901_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_aset_no);
		cstmt.setString(5, dm.to_aset_no);
		cstmt.setString(6, dm.buy_clsf);
		cstmt.setString(7, dm.fr_dept_cd);
		cstmt.setString(8, dm.to_dept_cd);
		cstmt.setString(9, dm.fr_acqr_dt);
		cstmt.setString(10, dm.to_acqr_dt);
		cstmt.setString(11, dm.aset_no_list);
		cstmt.setString(12, dm.aset_no_clsf);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.asrd.ds.AS_ASRD_1901_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fr_aset_no = " + getFr_aset_no());
        System.out.println("to_aset_no = " + getTo_aset_no());
        System.out.println("buy_clsf = " + getBuy_clsf());
        System.out.println("fr_dept_cd = " + getFr_dept_cd());
        System.out.println("to_dept_cd = " + getTo_dept_cd());
        System.out.println("fr_acqr_dt = " + getFr_acqr_dt());
        System.out.println("to_acqr_dt = " + getTo_acqr_dt());
        System.out.println("aset_no_list = " + getAset_no_list());
        System.out.println("aset_no_clsf = " + getAset_no_clsf());
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
String fr_aset_no = req.getParameter("fr_aset_no");
if( fr_aset_no == null){
	System.out.println(this.toString+" : fr_aset_no is null" );
}else{
	System.out.println(this.toString+" : fr_aset_no is "+fr_aset_no );
}
String to_aset_no = req.getParameter("to_aset_no");
if( to_aset_no == null){
	System.out.println(this.toString+" : to_aset_no is null" );
}else{
	System.out.println(this.toString+" : to_aset_no is "+to_aset_no );
}
String buy_clsf = req.getParameter("buy_clsf");
if( buy_clsf == null){
	System.out.println(this.toString+" : buy_clsf is null" );
}else{
	System.out.println(this.toString+" : buy_clsf is "+buy_clsf );
}
String fr_dept_cd = req.getParameter("fr_dept_cd");
if( fr_dept_cd == null){
	System.out.println(this.toString+" : fr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : fr_dept_cd is "+fr_dept_cd );
}
String to_dept_cd = req.getParameter("to_dept_cd");
if( to_dept_cd == null){
	System.out.println(this.toString+" : to_dept_cd is null" );
}else{
	System.out.println(this.toString+" : to_dept_cd is "+to_dept_cd );
}
String fr_acqr_dt = req.getParameter("fr_acqr_dt");
if( fr_acqr_dt == null){
	System.out.println(this.toString+" : fr_acqr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_acqr_dt is "+fr_acqr_dt );
}
String to_acqr_dt = req.getParameter("to_acqr_dt");
if( to_acqr_dt == null){
	System.out.println(this.toString+" : to_acqr_dt is null" );
}else{
	System.out.println(this.toString+" : to_acqr_dt is "+to_acqr_dt );
}
String aset_no_list = req.getParameter("aset_no_list");
if( aset_no_list == null){
	System.out.println(this.toString+" : aset_no_list is null" );
}else{
	System.out.println(this.toString+" : aset_no_list is "+aset_no_list );
}
String aset_no_clsf = req.getParameter("aset_no_clsf");
if( aset_no_clsf == null){
	System.out.println(this.toString+" : aset_no_clsf is null" );
}else{
	System.out.println(this.toString+" : aset_no_clsf is "+aset_no_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
String to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
String buy_clsf = Util.checkString(req.getParameter("buy_clsf"));
String fr_dept_cd = Util.checkString(req.getParameter("fr_dept_cd"));
String to_dept_cd = Util.checkString(req.getParameter("to_dept_cd"));
String fr_acqr_dt = Util.checkString(req.getParameter("fr_acqr_dt"));
String to_acqr_dt = Util.checkString(req.getParameter("to_acqr_dt"));
String aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
String aset_no_clsf = Util.checkString(req.getParameter("aset_no_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_aset_no")));
String to_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_aset_no")));
String buy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_clsf")));
String fr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dept_cd")));
String to_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dept_cd")));
String fr_acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_acqr_dt")));
String to_acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_acqr_dt")));
String aset_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_list")));
String aset_no_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_aset_no(fr_aset_no);
dm.setTo_aset_no(to_aset_no);
dm.setBuy_clsf(buy_clsf);
dm.setFr_dept_cd(fr_dept_cd);
dm.setTo_dept_cd(to_dept_cd);
dm.setFr_acqr_dt(fr_acqr_dt);
dm.setTo_acqr_dt(to_acqr_dt);
dm.setAset_no_list(aset_no_list);
dm.setAset_no_clsf(aset_no_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 09:18:43 KST 2009 */