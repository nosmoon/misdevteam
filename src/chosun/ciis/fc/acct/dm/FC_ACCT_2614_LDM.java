/***************************************************************************************************
* ���ϸ� : .java
* ��� : �����繫��ǥ-���ΰŷ����� �����ȸ(�Ǻ���ȸ)
* �ۼ����� : 2014.12.04
* �ۼ��� : ����
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


public class FC_ACCT_2614_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_no;

	public FC_ACCT_2614_LDM(){}
	public FC_ACCT_2614_LDM(String cmpy_cd, String slip_no){
		this.cmpy_cd = cmpy_cd;
		this.slip_no = slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2614_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2614_LDM dm = (FC_ACCT_2614_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2614_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_no = [" + getSlip_no() + "]");
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
String slip_no = req.getParameter("slip_no");
if( slip_no == null){
	System.out.println(this.toString+" : slip_no is null" );
}else{
	System.out.println(this.toString+" : slip_no is "+slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_no = Util.checkString(req.getParameter("slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_no(slip_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 04 15:01:05 KST 2014 */