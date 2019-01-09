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


public class FC_ACCT_2601_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_type_cd;
	public String search_yymm;

	public FC_ACCT_2601_LDM(){}
	public FC_ACCT_2601_LDM(String cmpy_cd, String acct_type_cd, String search_yymm){
		this.cmpy_cd = cmpy_cd;
		this.acct_type_cd = acct_type_cd;
		this.search_yymm = search_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_type_cd(String acct_type_cd){
		this.acct_type_cd = acct_type_cd;
	}

	public void setSearch_yymm(String search_yymm){
		this.search_yymm = search_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_type_cd(){
		return this.acct_type_cd;
	}

	public String getSearch_yymm(){
		return this.search_yymm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2601_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2601_LDM dm = (FC_ACCT_2601_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_type_cd);
		cstmt.setString(5, dm.search_yymm);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2601_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_type_cd = [" + getAcct_type_cd() + "]");
		System.out.println("search_yymm = [" + getSearch_yymm() + "]");
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
String acct_type_cd = req.getParameter("acct_type_cd");
if( acct_type_cd == null){
	System.out.println(this.toString+" : acct_type_cd is null" );
}else{
	System.out.println(this.toString+" : acct_type_cd is "+acct_type_cd );
}
String search_yymm = req.getParameter("search_yymm");
if( search_yymm == null){
	System.out.println(this.toString+" : search_yymm is null" );
}else{
	System.out.println(this.toString+" : search_yymm is "+search_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
String search_yymm = Util.checkString(req.getParameter("search_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_type_cd")));
String search_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_type_cd(acct_type_cd);
dm.setSearch_yymm(search_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 04 11:43:37 KST 2014 */