/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.13
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

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */

public class AD_CO_9100_SDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String action;
	public String cmpy_cd;
	public String medi_clsf;
	public String srch_dlco_no;
	public String srch_dlco_nm;
	public String srch_cust_seq;
	public String srch_cust_name;

	public AD_CO_9100_SDM(){}
	public AD_CO_9100_SDM(String action, String cmpy_cd, String medi_clsf, String srch_dlco_no, String srch_dlco_nm, String srch_cust_seq, String srch_cust_name)
	{
		this.action = action;
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.srch_dlco_no = srch_dlco_no;
		this.srch_dlco_nm = srch_dlco_nm;
		this.srch_cust_seq = srch_cust_seq;
		this.srch_cust_name = srch_cust_name;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public void setCmpyCd(String cmpy_cd)
	{
		this.cmpy_cd = cmpy_cd;
	}

	public void setMediClsf(String medi_clsf)
	{
		this.medi_clsf = medi_clsf;
	}

	public void setSrchDlcoNo(String srch_dlco_no)
	{
		this.srch_dlco_no = srch_dlco_no;
	}
	
	public void setSrchDlcoNm(String srch_dlco_nm)
	{
		this.srch_dlco_nm = srch_dlco_nm;
	}
	
	public void setSrchCustSeq(String srch_cust_seq)
	{
		this.srch_cust_seq = srch_cust_seq;
	}
	
	public void setSrchCustName(String srch_cust_name)
	{
		this.srch_cust_name = srch_cust_name;
	}

	public String getAction()
	{
		return this.action;
	}

	public String getCmpyCd()
	{
		return this.cmpy_cd;
	}

	public String getMediClsf()
	{
		return this.medi_clsf;
	}

	public String getSrchDlcoNo()
	{
		return this.srch_dlco_no;
	}
	
	public String getSrchDlcoNm()
	{
		return this.srch_dlco_nm;
	}
	
	public String getSrchCustSeq()
	{
		return this.srch_cust_seq;
	}
	
	public String getSrchCustName()
	{
		return this.srch_cust_name;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_9100_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_CO_9100_SDM dm = (AD_CO_9100_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.action);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.srch_dlco_no);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.srch_dlco_nm);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.srch_cust_seq);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.setString(9, dm.srch_cust_name);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.common.ds.AD_CO_9100_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("action = [" + getAction() + "]");
		System.out.println("cmpy_cd = [" + getCmpyCd() + "]");
		System.out.println("medi_clsf = [" + getMediClsf() + "]");
		System.out.println("srch_dlco_no = [" + getSrchDlcoNo() + "]");
		System.out.println("srch_dlco_nm = [" + getSrchDlcoNm() + "]");
		System.out.println("srch_cust_seq = [" + getSrchCustSeq() + "]");
		System.out.println("srch_cust_name = [" + getSrchCustName() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String action = req.getParameter("action");
if( action == null){
	System.out.println(this.toString+" : action is null" );
}else{
	System.out.println(this.toString+" : action is "+action );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String srch_nm = req.getParameter("srch_nm");
if( srch_nm == null){
	System.out.println(this.toString+" : srch_nm is null" );
}else{
	System.out.println(this.toString+" : srch_nm is "+srch_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String action = Util.checkString(req.getParameter("action"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String srch_nm = Util.checkString(req.getParameter("srch_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String action = Util.Uni2Ksc(Util.checkString(req.getParameter("action")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String srch_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAction(action);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setSrch_nm(srch_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 17:25:04 KST 2009 */