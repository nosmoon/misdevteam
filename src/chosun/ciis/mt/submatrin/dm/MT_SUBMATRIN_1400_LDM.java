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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 *
 */


public class MT_SUBMATRIN_1400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_ft;
	public String occr_dt_to;
	public String esp;

	public MT_SUBMATRIN_1400_LDM(){}
	public MT_SUBMATRIN_1400_LDM(String cmpy_cd, String occr_dt_ft, String occr_dt_to, String esp){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_ft = occr_dt_ft;
		this.occr_dt_to = occr_dt_to;
		this.esp = esp;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_ft(String occr_dt_ft){
		this.occr_dt_ft = occr_dt_ft;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setEsp(String esp){
		this.esp = esp;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_ft(){
		return this.occr_dt_ft;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getEsp(){
		return this.esp;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1400_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1400_LDM dm = (MT_SUBMATRIN_1400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_ft);
		cstmt.setString(5, dm.occr_dt_to);
		cstmt.setString(6, dm.esp);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1400_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt_ft = " + getOccr_dt_ft());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
        System.out.println("esp = " + getEsp());
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
String occr_dt_ft = req.getParameter("occr_dt_ft");
if( occr_dt_ft == null){
	System.out.println(this.toString+" : occr_dt_ft is null" );
}else{
	System.out.println(this.toString+" : occr_dt_ft is "+occr_dt_ft );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String esp = req.getParameter("esp");
if( esp == null){
	System.out.println(this.toString+" : esp is null" );
}else{
	System.out.println(this.toString+" : esp is "+esp );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_ft = Util.checkString(req.getParameter("occr_dt_ft"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String esp = Util.checkString(req.getParameter("esp"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_ft")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String esp = Util.Uni2Ksc(Util.checkString(req.getParameter("esp")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_ft(occr_dt_ft);
dm.setOccr_dt_to(occr_dt_to);
dm.setEsp(esp);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 12:02:43 KST 2009 */