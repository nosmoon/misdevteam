/***************************************************************************************************
* ���ϸ� : SE_SND_3500_MDataSet
* ��� : �Ǹ� - �߼۰��� - ��Ÿ�μ�ó����
* �ۼ����� : 2009-03-24
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList routelist = new ArrayList();
	public ArrayList placlist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3500_MDataSet(){}
	public SE_SND_3500_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SE_SND_3500_MROUTELISTRecord rec = new SE_SND_3500_MROUTELISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.routelist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SE_SND_3500_MMEDILISTRecord rec = new SE_SND_3500_MMEDILISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.medilist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SE_SND_3500_MPLACLISTRecord rec = new SE_SND_3500_MPLACLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.placlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_3500_MDataSet ds = (SE_SND_3500_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_3500_MROUTELISTRecord routelistRec = (SE_SND_3500_MROUTELISTRecord)ds.routelist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_SND_3500_MMEDILISTRecord medilistRec = (SE_SND_3500_MMEDILISTRecord)ds.medilist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.placlist.size(); i++){
		SE_SND_3500_MPLACLISTRecord placlistRec = (SE_SND_3500_MPLACLISTRecord)ds.placlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRoutelist()%>
<%= ds.getMedilist()%>
<%= ds.getPlaclist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= placlistRec.cd%>
<%= placlistRec.cdnm%>
<%= placlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 20 14:07:08 KST 2009 */