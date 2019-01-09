/***************************************************************************************************
* 파일명   : SP_CO_JOB_1060_S.java
* 기능     : 업무연락-업무지시답변 상세조회
* 작성일자 : 2009-01-15
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.co.job.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 업무연락-업무지시답변 상세조회
 */


public class CO_JOB_1060_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public long cntc_seq;
	public long answer_seq;

	public CO_JOB_1060_SDM(){}
	public CO_JOB_1060_SDM(String cmpy_cd, String medi_clsf, long cntc_seq, long answer_seq){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.cntc_seq = cntc_seq;
		this.answer_seq = answer_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setCntc_seq(long cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setAnswer_seq(long answer_seq){
		this.answer_seq = answer_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public long getCntc_seq(){
		return this.cntc_seq;
	}

	public long getAnswer_seq(){
		return this.answer_seq;
	}

	public String getSQL(){
		 return "{ call SP_CO_JOB_1060_S( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_1060_SDM dm = (CO_JOB_1060_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setLong(5, dm.cntc_seq);
		cstmt.setLong(6, dm.answer_seq);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_1060_SDataSet();
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String cntc_seq = req.getParameter("cntc_seq");
if( cntc_seq == null){
	System.out.println(this.toString+" : cntc_seq is null" );
}else{
	System.out.println(this.toString+" : cntc_seq is "+cntc_seq );
}
String answer_seq = req.getParameter("answer_seq");
if( answer_seq == null){
	System.out.println(this.toString+" : answer_seq is null" );
}else{
	System.out.println(this.toString+" : answer_seq is "+answer_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
String answer_seq = Util.checkString(req.getParameter("answer_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String cntc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_seq")));
String answer_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("answer_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setCntc_seq(cntc_seq);
dm.setAnswer_seq(answer_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 16:43:15 KST 2009 */