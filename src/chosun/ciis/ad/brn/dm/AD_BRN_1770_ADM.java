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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_1770_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cntc_seq;
	public String rmsg_seq;

	public AD_BRN_1770_ADM(){}
	public AD_BRN_1770_ADM(String cmpy_cd, String job_clsf, String cntc_seq, String rmsg_seq){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
		this.rmsg_seq = rmsg_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setRmsg_seq(String rmsg_seq){
		this.rmsg_seq = rmsg_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getRmsg_seq(){
		return this.rmsg_seq;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_1770_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_1770_ADM dm = (AD_BRN_1770_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cntc_seq);
		cstmt.setString(6, dm.rmsg_seq);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_1770_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("cntc_seq = [" + getCntc_seq() + "]");
		System.out.println("rmsg_seq = [" + getRmsg_seq() + "]");
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cntc_seq = req.getParameter("cntc_seq");
if( cntc_seq == null){
	System.out.println(this.toString+" : cntc_seq is null" );
}else{
	System.out.println(this.toString+" : cntc_seq is "+cntc_seq );
}
String rmsg_seq = req.getParameter("rmsg_seq");
if( rmsg_seq == null){
	System.out.println(this.toString+" : rmsg_seq is null" );
}else{
	System.out.println(this.toString+" : rmsg_seq is "+rmsg_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
String rmsg_seq = Util.checkString(req.getParameter("rmsg_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cntc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_seq")));
String rmsg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCntc_seq(cntc_seq);
dm.setRmsg_seq(rmsg_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 16:55:36 KST 2009 */