/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - ���ݰ�꼭 ������ ����
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
 * ���� - ���ݰ�꼭 ������ ����
 */


public class CO_SMTB_1061_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cert_regno;
	public String cert_comname;
	public String userdn;
	public String userinfo;

	public CO_SMTB_1061_UDM(){}
	public CO_SMTB_1061_UDM(String cert_regno, String cert_comname, String userdn, String userinfo){
		this.cert_regno = cert_regno;
		this.cert_comname = cert_comname;
		this.userdn = userdn;
		this.userinfo = userinfo;
	}

	public void setCert_regno(String cert_regno){
		this.cert_regno = cert_regno;
	}

	public void setCert_comname(String cert_comname){
		this.cert_comname = cert_comname;
	}

	public void setUserdn(String userdn){
		this.userdn = userdn;
	}

	public void setUserinfo(String userinfo){
		this.userinfo = userinfo;
	}

	public String getCert_regno(){
		return this.cert_regno;
	}

	public String getCert_comname(){
		return this.cert_comname;
	}

	public String getUserdn(){
		return this.userdn;
	}

	public String getUserinfo(){
		return this.userinfo;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1061_U(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1061_UDM dm = (CO_SMTB_1061_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cert_regno);
		cstmt.setString(4, dm.cert_comname);
		cstmt.setString(5, dm.userdn);
		cstmt.setString(6, dm.userinfo);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1061_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cert_regno = [" + getCert_regno() + "]");
		System.out.println("cert_comname = [" + getCert_comname() + "]");
		System.out.println("userdn = [" + getUserdn() + "]");
		System.out.println("userinfo = [" + getUserinfo() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cert_regno = req.getParameter("cert_regno");
if( cert_regno == null){
	System.out.println(this.toString+" : cert_regno is null" );
}else{
	System.out.println(this.toString+" : cert_regno is "+cert_regno );
}
String cert_comname = req.getParameter("cert_comname");
if( cert_comname == null){
	System.out.println(this.toString+" : cert_comname is null" );
}else{
	System.out.println(this.toString+" : cert_comname is "+cert_comname );
}
String userdn = req.getParameter("userdn");
if( userdn == null){
	System.out.println(this.toString+" : userdn is null" );
}else{
	System.out.println(this.toString+" : userdn is "+userdn );
}
String userinfo = req.getParameter("userinfo");
if( userinfo == null){
	System.out.println(this.toString+" : userinfo is null" );
}else{
	System.out.println(this.toString+" : userinfo is "+userinfo );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cert_regno = Util.checkString(req.getParameter("cert_regno"));
String cert_comname = Util.checkString(req.getParameter("cert_comname"));
String userdn = Util.checkString(req.getParameter("userdn"));
String userinfo = Util.checkString(req.getParameter("userinfo"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cert_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("cert_regno")));
String cert_comname = Util.Uni2Ksc(Util.checkString(req.getParameter("cert_comname")));
String userdn = Util.Uni2Ksc(Util.checkString(req.getParameter("userdn")));
String userinfo = Util.Uni2Ksc(Util.checkString(req.getParameter("userinfo")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCert_regno(cert_regno);
dm.setCert_comname(cert_comname);
dm.setUserdn(userdn);
dm.setUserinfo(userinfo);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 17 16:08:11 KST 2011 */