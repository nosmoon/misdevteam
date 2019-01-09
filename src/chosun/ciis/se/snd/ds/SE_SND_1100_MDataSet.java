/***************************************************************************************************
* ���ϸ� : SE_SND_1100_MDataSet.java
* ��� : �Ǹ� - �߼۰��� - �뼱���
 * �ۼ����� : 2009.02.03
 * �ۼ��� :   �����
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


public class SE_SND_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ledtlist = new ArrayList();
	public ArrayList prtlist = new ArrayList();
	public ArrayList routelist = new ArrayList();
	public ArrayList ecntlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_1100_MDataSet(){}
	public SE_SND_1100_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_1100_MROUTELISTRecord rec = new SE_SND_1100_MROUTELISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.mang_cd_1 	= Util.checkString(rset0.getString("mang_cd_1"	));
			
			this.routelist.add(rec);
		}
		ResultSet rset1 	= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_SND_1100_MPRTLISTRecord rec = new SE_SND_1100_MPRTLISTRecord();
			rec.cd 			= Util.checkString(rset1.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset1.getString("cdnm"		));
			this.prtlist.add(rec);
		}
		ResultSet rset2 	= (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_SND_1100_MECNTLISTRecord rec = new SE_SND_1100_MECNTLISTRecord();
			rec.cd 			= Util.checkString(rset2.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset2.getString("cdnm"		));
			this.ecntlist.add(rec);
		}
		ResultSet rset3 	= (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SE_SND_1100_MLEDTLISTRecord rec = new SE_SND_1100_MLEDTLISTRecord();
			rec.cd 			= Util.checkString(rset3.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset3.getString("cdnm"		));
			this.ledtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1100_MDataSet ds = (SE_SND_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_1100_MROUTELISTRecord routelistRec = (SE_SND_1100_MROUTELISTRecord)ds.routelist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.prtlist.size(); i++){
		SE_SND_1100_MPRTLISTRecord prtlistRec = (SE_SND_1100_MPRTLISTRecord)ds.prtlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.ecntlist.size(); i++){
		SE_SND_1100_MECNTLISTRecord ecntlistRec = (SE_SND_1100_MECNTLISTRecord)ds.ecntlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.ledtlist.size(); i++){
		SE_SND_1100_MLEDTLISTRecord ledtlistRec = (SE_SND_1100_MLEDTLISTRecord)ds.ledtlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRoutelist()%>
<%= ds.getPrtlist()%>
<%= ds.getEcntlist()%>
<%= ds.getLedtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= prtlistRec.cd%>
<%= prtlistRec.cdnm%>
<%= ecntlistRec.cd%>
<%= ecntlistRec.cdnm%>
<%= ledtlistRec.cd%>
<%= ledtlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 20 15:56:25 KST 2009 */