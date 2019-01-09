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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_3000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String swmang_no;

	public MT_ETCPC_3000_LDM(){}
	public MT_ETCPC_3000_LDM(String cmpy_cd, String swmang_no){
		this.cmpy_cd = cmpy_cd;
		this.swmang_no = swmang_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_3000_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_3000_LDM dm = (MT_ETCPC_3000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.swmang_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_3000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("swmang_no = [" + getSwmang_no() + "]");
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
String swmang_no = req.getParameter("swmang_no");
if( swmang_no == null){
	System.out.println(this.toString+" : swmang_no is null" );
}else{
	System.out.println(this.toString+" : swmang_no is "+swmang_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String swmang_no = Util.checkString(req.getParameter("swmang_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String swmang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("swmang_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSwmang_no(swmang_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 26 17:42:17 KST 2009 */