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


public class FC_ACCT_2942_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aprv_slip_occr_dt;
	public String aprv_slip_clsf;
	public String aprv_slip_occr_seqo;
	public String aprv_slip_occr_sub_seq;

	public FC_ACCT_2942_SDM(){}
	public FC_ACCT_2942_SDM(String cmpy_cd, String aprv_slip_occr_dt, String aprv_slip_clsf, String aprv_slip_occr_seqo, String aprv_slip_occr_sub_seq){
		this.cmpy_cd = cmpy_cd;
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
		this.aprv_slip_clsf = aprv_slip_clsf;
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAprv_slip_occr_dt(String aprv_slip_occr_dt){
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
	}

	public void setAprv_slip_clsf(String aprv_slip_clsf){
		this.aprv_slip_clsf = aprv_slip_clsf;
	}

	public void setAprv_slip_occr_seqo(String aprv_slip_occr_seqo){
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
	}

	public void setAprv_slip_occr_sub_seq(String aprv_slip_occr_sub_seq){
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAprv_slip_occr_dt(){
		return this.aprv_slip_occr_dt;
	}

	public String getAprv_slip_clsf(){
		return this.aprv_slip_clsf;
	}

	public String getAprv_slip_occr_seqo(){
		return this.aprv_slip_occr_seqo;
	}

	public String getAprv_slip_occr_sub_seq(){
		return this.aprv_slip_occr_sub_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2942_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2942_SDM dm = (FC_ACCT_2942_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aprv_slip_occr_dt);
		cstmt.setString(5, dm.aprv_slip_clsf);
		cstmt.setString(6, dm.aprv_slip_occr_seqo);
		cstmt.setString(7, dm.aprv_slip_occr_sub_seq);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2942_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aprv_slip_occr_dt = [" + getAprv_slip_occr_dt() + "]");
		System.out.println("aprv_slip_clsf = [" + getAprv_slip_clsf() + "]");
		System.out.println("aprv_slip_occr_seqo = [" + getAprv_slip_occr_seqo() + "]");
		System.out.println("aprv_slip_occr_sub_seq = [" + getAprv_slip_occr_sub_seq() + "]");
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
String aprv_slip_occr_dt = req.getParameter("aprv_slip_occr_dt");
if( aprv_slip_occr_dt == null){
	System.out.println(this.toString+" : aprv_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_dt is "+aprv_slip_occr_dt );
}
String aprv_slip_clsf = req.getParameter("aprv_slip_clsf");
if( aprv_slip_clsf == null){
	System.out.println(this.toString+" : aprv_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_clsf is "+aprv_slip_clsf );
}
String aprv_slip_occr_seqo = req.getParameter("aprv_slip_occr_seqo");
if( aprv_slip_occr_seqo == null){
	System.out.println(this.toString+" : aprv_slip_occr_seqo is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_seqo is "+aprv_slip_occr_seqo );
}
String aprv_slip_occr_sub_seq = req.getParameter("aprv_slip_occr_sub_seq");
if( aprv_slip_occr_sub_seq == null){
	System.out.println(this.toString+" : aprv_slip_occr_sub_seq is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_sub_seq is "+aprv_slip_occr_sub_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aprv_slip_occr_dt = Util.checkString(req.getParameter("aprv_slip_occr_dt"));
String aprv_slip_clsf = Util.checkString(req.getParameter("aprv_slip_clsf"));
String aprv_slip_occr_seqo = Util.checkString(req.getParameter("aprv_slip_occr_seqo"));
String aprv_slip_occr_sub_seq = Util.checkString(req.getParameter("aprv_slip_occr_sub_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aprv_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_dt")));
String aprv_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_clsf")));
String aprv_slip_occr_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_seqo")));
String aprv_slip_occr_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_sub_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAprv_slip_occr_dt(aprv_slip_occr_dt);
dm.setAprv_slip_clsf(aprv_slip_clsf);
dm.setAprv_slip_occr_seqo(aprv_slip_occr_seqo);
dm.setAprv_slip_occr_sub_seq(aprv_slip_occr_sub_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 19 14:08:44 KST 2009 */