/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.14
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String cust_seq;
	public String cust_name;

	public AD_CO_1510_LDM(){}
	public AD_CO_1510_LDM(String cmpy_cd, String medi_clsf, String dlco_no, String dlco_nm, String cust_seq, String cust_name)
	{
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.cust_seq = cust_seq;
		this.cust_name = cust_name;
	}

	public void setCmpyCd(String cmpy_cd)
	{
		this.cmpy_cd = cmpy_cd;
	}
	public void setMediClsf(String medi_clsf)
	{
		this.medi_clsf = medi_clsf;
	}
	public void setDlcoNo(String dlco_no)
	{
		this.dlco_no = dlco_no;
	}
	public void setDlcoNm(String dlco_nm)
	{
		this.dlco_nm = dlco_nm;
	}
	public void setCustSeq(String cust_seq)
	{
		this.cust_seq = cust_seq;
	}
	public void setCustName(String cust_name)
	{
		this.cust_name = cust_name;
	}
	
	public String getCmpyCd()
	{
		return this.cmpy_cd;
	}
	public String getMediClsf()
	{
		return this.medi_clsf;
	}
	public String getDlcoNo()
	{
		return this.dlco_no;
	}
	public String getDlcoNm()
	{
		return this.dlco_nm;
	}
	public String getCustSeq()
	{
		return this.cust_seq;
	}
	public String getCustName()
	{
		return this.cust_name;
	}
	
	public String getSQL()
	{
		 return "{ call MISADV.SP_AD_CO_1510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_CO_1510_LDM dm = (AD_CO_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.dlco_nm);
		cstmt.setString(7, dm.cust_seq);
		cstmt.setString(8, dm.cust_name);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.common.ds.AD_CO_1510_LDataSet();
	}

	public void print()
	{
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpyCd() + "]");
		System.out.println("medi_clsf = [" + getMediClsf() + "]");
		System.out.println("dlco_no = [" + getDlcoNo() + "]");
		System.out.println("dlco_nm = [" + getDlcoNm() + "]");
		System.out.println("cust_seq = [" + getCustSeq() + "]");
		System.out.println("cust_name = [" + getCustName() + "]");
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
String dlco_no1 = req.getParameter("dlco_no1");
if( dlco_no1 == null){
	System.out.println(this.toString+" : dlco_no1 is null" );
}else{
	System.out.println(this.toString+" : dlco_no1 is "+dlco_no1 );
}
String dlco_no2 = req.getParameter("dlco_no2");
if( dlco_no2 == null){
	System.out.println(this.toString+" : dlco_no2 is null" );
}else{
	System.out.println(this.toString+" : dlco_no2 is "+dlco_no2 );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String gnr_advcs_yn = req.getParameter("gnr_advcs_yn");
if( gnr_advcs_yn == null){
	System.out.println(this.toString+" : gnr_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : gnr_advcs_yn is "+gnr_advcs_yn );
}
String arow_advcs_yn = req.getParameter("arow_advcs_yn");
if( arow_advcs_yn == null){
	System.out.println(this.toString+" : arow_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : arow_advcs_yn is "+arow_advcs_yn );
}
String agn_yn = req.getParameter("agn_yn");
if( agn_yn == null){
	System.out.println(this.toString+" : agn_yn is null" );
}else{
	System.out.println(this.toString+" : agn_yn is "+agn_yn );
}
String advt_bo_yn = req.getParameter("advt_bo_yn");
if( advt_bo_yn == null){
	System.out.println(this.toString+" : advt_bo_yn is null" );
}else{
	System.out.println(this.toString+" : advt_bo_yn is "+advt_bo_yn );
}
String bo_bof_yn = req.getParameter("bo_bof_yn");
if( bo_bof_yn == null){
	System.out.println(this.toString+" : bo_bof_yn is null" );
}else{
	System.out.println(this.toString+" : bo_bof_yn is "+bo_bof_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no1 = Util.checkString(req.getParameter("dlco_no1"));
String dlco_no2 = Util.checkString(req.getParameter("dlco_no2"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
String agn_yn = Util.checkString(req.getParameter("agn_yn"));
String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no1")));
String dlco_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no2")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String gnr_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_advcs_yn")));
String arow_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("arow_advcs_yn")));
String agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_yn")));
String advt_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bo_yn")));
String bo_bof_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_bof_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no1(dlco_no1);
dm.setDlco_no2(dlco_no2);
dm.setDlco_nm(dlco_nm);
dm.setGnr_advcs_yn(gnr_advcs_yn);
dm.setArow_advcs_yn(arow_advcs_yn);
dm.setAgn_yn(agn_yn);
dm.setAdvt_bo_yn(advt_bo_yn);
dm.setBo_bof_yn(bo_bof_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 17:25:07 KST 2009 */