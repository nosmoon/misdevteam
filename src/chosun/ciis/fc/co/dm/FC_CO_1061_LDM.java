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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1061_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_stat_cd;

	public FC_CO_1061_LDM(){}
	public FC_CO_1061_LDM(String cmpy_cd, String cntr_clsf_cd, String leas_stat_cd){
		this.cmpy_cd = cmpy_cd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getSQL(){
		 return "{ call SP_FC_CO_1061_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_1061_LDM dm = (FC_CO_1061_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cntr_clsf_cd);
		cstmt.setString(5, dm.leas_stat_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_1061_LDataSet();
	}



    public void print(){
    	System.out.println(this.getSQL());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("cntr_clsf_cd = " + getCntr_clsf_cd());
        System.out.println("leas_stat_cd = " + getLeas_stat_cd());
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
String cntr_clsf_cd = req.getParameter("cntr_clsf_cd");
if( cntr_clsf_cd == null){
	System.out.println(this.toString+" : cntr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : cntr_clsf_cd is "+cntr_clsf_cd );
}
String leas_stat_cd = req.getParameter("leas_stat_cd");
if( leas_stat_cd == null){
	System.out.println(this.toString+" : leas_stat_cd is null" );
}else{
	System.out.println(this.toString+" : leas_stat_cd is "+leas_stat_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
String leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cntr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_clsf_cd")));
String leas_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_stat_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCntr_clsf_cd(cntr_clsf_cd);
dm.setLeas_stat_cd(leas_stat_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 10:40:31 KST 2009 */