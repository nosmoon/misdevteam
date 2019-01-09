/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class FC_ACCT_6136_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String vat_decl_yymm;
	public String erplace_cd;

	public FC_ACCT_6136_SDM(){}
	public FC_ACCT_6136_SDM(String cmpy_cd, String vat_decl_yymm, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.vat_decl_yymm = vat_decl_yymm;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setVat_decl_yymm(String vat_decl_yymm){
		this.vat_decl_yymm = vat_decl_yymm;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getVat_decl_yymm(){
		return this.vat_decl_yymm;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6136_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6136_SDM dm = (FC_ACCT_6136_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.vat_decl_yymm);
		cstmt.setString(5, dm.erplace_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6136_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("vat_decl_yymm = [" + getVat_decl_yymm() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String vat_decl_yymm = req.getParameter("vat_decl_yymm");
if( vat_decl_yymm == null){
	System.out.println(this.toString+" : vat_decl_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_decl_yymm is "+vat_decl_yymm );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String vat_decl_yymm = Util.checkString(req.getParameter("vat_decl_yymm"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String vat_decl_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_decl_yymm")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setVat_decl_yymm(vat_decl_yymm);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 15 19:43:14 KST 2009 */