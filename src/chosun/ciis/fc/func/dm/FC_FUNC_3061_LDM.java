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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_3061_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_yymm;
	public String to_yymm;

	public FC_FUNC_3061_LDM(){}
	public FC_FUNC_3061_LDM(String cmpy_cd, String from_yymm, String to_yymm){
		this.cmpy_cd = cmpy_cd;
		this.from_yymm = from_yymm;
		this.to_yymm = to_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_yymm(String from_yymm){
		this.from_yymm = from_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_yymm(){
		return this.from_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3061_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3061_LDM dm = (FC_FUNC_3061_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_yymm);
		cstmt.setString(5, dm.to_yymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3061_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_yymm = [" + getFrom_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
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
String from_yymm = req.getParameter("from_yymm");
if( from_yymm == null){
	System.out.println(this.toString+" : from_yymm is null" );
}else{
	System.out.println(this.toString+" : from_yymm is "+from_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_yymm = Util.checkString(req.getParameter("from_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("from_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_yymm(from_yymm);
dm.setTo_yymm(to_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 31 16:32:04 KST 2009 */