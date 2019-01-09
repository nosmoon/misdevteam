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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2272_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seqfr;
	public String slip_seqto;

	public FC_ACCT_2272_SDM(){}
	public FC_ACCT_2272_SDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seqfr, String slip_seqto){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seqfr = slip_seqfr;
		this.slip_seqto = slip_seqto;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seqfr(String slip_seqfr){
		this.slip_seqfr = slip_seqfr;
	}

	public void setSlip_seqto(String slip_seqto){
		this.slip_seqto = slip_seqto;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seqfr(){
		return this.slip_seqfr;
	}

	public String getSlip_seqto(){
		return this.slip_seqto;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2272_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2272_SDM dm = (FC_ACCT_2272_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seqfr);
		cstmt.setString(7, dm.slip_seqto);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2272_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seqfr = [" + getSlip_seqfr() + "]");
		System.out.println("slip_seqto = [" + getSlip_seqto() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seqfr = req.getParameter("slip_seqfr");
if( slip_seqfr == null){
	System.out.println(this.toString+" : slip_seqfr is null" );
}else{
	System.out.println(this.toString+" : slip_seqfr is "+slip_seqfr );
}
String slip_seqto = req.getParameter("slip_seqto");
if( slip_seqto == null){
	System.out.println(this.toString+" : slip_seqto is null" );
}else{
	System.out.println(this.toString+" : slip_seqto is "+slip_seqto );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seqfr = Util.checkString(req.getParameter("slip_seqfr"));
String slip_seqto = Util.checkString(req.getParameter("slip_seqto"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seqfr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seqfr")));
String slip_seqto = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seqto")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seqfr(slip_seqfr);
dm.setSlip_seqto(slip_seqto);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 11:14:35 KST 2009 */