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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_2030_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String membertype;
	public String name;

	public TN_DNS_2030_LDM(){}
	public TN_DNS_2030_LDM(String cmpy_cd, String membertype, String name){
		this.cmpy_cd = cmpy_cd;
		this.membertype = membertype;
		this.name = name;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getName(){
		return this.name;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_2030_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_2030_LDM dm = (TN_DNS_2030_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.membertype);
		cstmt.setString(5, dm.name);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_2030_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("membertype = [" + getMembertype() + "]");
		System.out.println("name = [" + getName() + "]");
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
String membertype = req.getParameter("membertype");
if( membertype == null){
	System.out.println(this.toString+" : membertype is null" );
}else{
	System.out.println(this.toString+" : membertype is "+membertype );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String membertype = Util.checkString(req.getParameter("membertype"));
String name = Util.checkString(req.getParameter("name"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String membertype = Util.Uni2Ksc(Util.checkString(req.getParameter("membertype")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMembertype(membertype);
dm.setName(name);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 28 19:29:58 KST 2016 */