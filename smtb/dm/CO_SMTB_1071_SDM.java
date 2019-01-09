/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - ���ݰ�꼭 ����� ����ȸ 
* �ۼ����� : 2011-05-16
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.smtb.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.ds.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * ���� - ���ݰ�꼭 ����� ����ȸ
 */


public class CO_SMTB_1071_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fnd_user;
	public String fnd_regno;

	public CO_SMTB_1071_SDM(){}
	public CO_SMTB_1071_SDM(String fnd_user, String fnd_regno){
		this.fnd_user = fnd_user;
		this.fnd_regno = fnd_regno;
	}

	public void setFnd_user(String fnd_user){
		this.fnd_user = fnd_user;
	}

	public void setFnd_regno(String fnd_regno){
		this.fnd_regno = fnd_regno;
	}

	public String getFnd_user(){
		return this.fnd_user;
	}

	public String getFnd_regno(){
		return this.fnd_regno;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1071_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1071_SDM dm = (CO_SMTB_1071_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fnd_user);
		cstmt.setString(4, dm.fnd_regno);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1071_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fnd_user = [" + getFnd_user() + "]");
		System.out.println("fnd_regno = [" + getFnd_regno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String fnd_user = req.getParameter("fnd_user");
if( fnd_user == null){
	System.out.println(this.toString+" : fnd_user is null" );
}else{
	System.out.println(this.toString+" : fnd_user is "+fnd_user );
}
String fnd_regno = req.getParameter("fnd_regno");
if( fnd_regno == null){
	System.out.println(this.toString+" : fnd_regno is null" );
}else{
	System.out.println(this.toString+" : fnd_regno is "+fnd_regno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String fnd_user = Util.checkString(req.getParameter("fnd_user"));
String fnd_regno = Util.checkString(req.getParameter("fnd_regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String fnd_user = Util.Uni2Ksc(Util.checkString(req.getParameter("fnd_user")));
String fnd_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("fnd_regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFnd_user(fnd_user);
dm.setFnd_regno(fnd_regno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 16 10:51:37 KST 2011 */