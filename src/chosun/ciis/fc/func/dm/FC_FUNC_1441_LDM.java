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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1441_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_dt1;
	public String stat_dt2;
	public String stat_cd1;
	public String stat_cd2;
	public String stat_cd;

	public FC_FUNC_1441_LDM(){}
	public FC_FUNC_1441_LDM(String cmpy_cd, String stat_dt1, String stat_dt2, String stat_cd1, String stat_cd2, String stat_cd){
		this.cmpy_cd = cmpy_cd;
		this.stat_dt1 = stat_dt1;
		this.stat_dt2 = stat_dt2;
		this.stat_cd1 = stat_cd1;
		this.stat_cd2 = stat_cd2;
		this.stat_cd = stat_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt1(String stat_dt1){
		this.stat_dt1 = stat_dt1;
	}

	public void setStat_dt2(String stat_dt2){
		this.stat_dt2 = stat_dt2;
	}

	public void setStat_cd1(String stat_cd1){
		this.stat_cd1 = stat_cd1;
	}

	public void setStat_cd2(String stat_cd2){
		this.stat_cd2 = stat_cd2;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt1(){
		return this.stat_dt1;
	}

	public String getStat_dt2(){
		return this.stat_dt2;
	}

	public String getStat_cd1(){
		return this.stat_cd1;
	}

	public String getStat_cd2(){
		return this.stat_cd2;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1441_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1441_LDM dm = (FC_FUNC_1441_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_dt1);
		cstmt.setString(5, dm.stat_dt2);
		cstmt.setString(6, dm.stat_cd1);
		cstmt.setString(7, dm.stat_cd2);
		cstmt.setString(8, dm.stat_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1441_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stat_dt1 = " + getStat_dt1());
        System.out.println("stat_dt2 = " + getStat_dt2());
        System.out.println("stat_cd1 = " + getStat_cd1());
        System.out.println("stat_cd2 = " + getStat_cd2());
        System.out.println("stat_cd = " + getStat_cd());
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
String stat_dt1 = req.getParameter("stat_dt1");
if( stat_dt1 == null){
	System.out.println(this.toString+" : stat_dt1 is null" );
}else{
	System.out.println(this.toString+" : stat_dt1 is "+stat_dt1 );
}
String stat_dt2 = req.getParameter("stat_dt2");
if( stat_dt2 == null){
	System.out.println(this.toString+" : stat_dt2 is null" );
}else{
	System.out.println(this.toString+" : stat_dt2 is "+stat_dt2 );
}
String stat_cd1 = req.getParameter("stat_cd1");
if( stat_cd1 == null){
	System.out.println(this.toString+" : stat_cd1 is null" );
}else{
	System.out.println(this.toString+" : stat_cd1 is "+stat_cd1 );
}
String stat_cd2 = req.getParameter("stat_cd2");
if( stat_cd2 == null){
	System.out.println(this.toString+" : stat_cd2 is null" );
}else{
	System.out.println(this.toString+" : stat_cd2 is "+stat_cd2 );
}
String stat_cd = req.getParameter("stat_cd");
if( stat_cd == null){
	System.out.println(this.toString+" : stat_cd is null" );
}else{
	System.out.println(this.toString+" : stat_cd is "+stat_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt1 = Util.checkString(req.getParameter("stat_dt1"));
String stat_dt2 = Util.checkString(req.getParameter("stat_dt2"));
String stat_cd1 = Util.checkString(req.getParameter("stat_cd1"));
String stat_cd2 = Util.checkString(req.getParameter("stat_cd2"));
String stat_cd = Util.checkString(req.getParameter("stat_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt1")));
String stat_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt2")));
String stat_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd1")));
String stat_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd2")));
String stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt1(stat_dt1);
dm.setStat_dt2(stat_dt2);
dm.setStat_cd1(stat_cd1);
dm.setStat_cd2(stat_cd2);
dm.setStat_cd(stat_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 16:18:38 KST 2009 */