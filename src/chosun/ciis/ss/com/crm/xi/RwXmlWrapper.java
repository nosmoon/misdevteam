package chosun.ciis.ss.com.crm.xi;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import kr.co.comsquare.rwXmlLib.RwXml;

public class RwXmlWrapper extends RwXml {
	
	public RwXmlWrapper()
	{
		super();
		initialize();
	}
	
	/**
	 * RwXml ��ü�� �����ϰ� encoding�� ����.
	 */
	public void initialize()
	{
		setEncoding("EUC-KR");
	}
	
	/**
	 * ������ xml�� ����Ѵ�.
	 * @param out : jsp�� out ��ü.
	 * @throws IOException
	 */
	public void flush(JspWriter out) throws IOException
	{
		out.println(xmlFlush());
		out.println(xmlEndFlush());
	}
	
	private String replace(String src)
	{
		if(src == null || src.equals(""))
			return "";
		
		if(src.indexOf("&")<0)
			return src;
		
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<src.length(); i++)
		{
			switch(src.charAt(i))
			{
				case '&' : sb.append("&amp;");
				           break;
				default : sb.append(src.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * record ��ü�� ���� �ʵ带 xml ���� ��ȯ�Ѵ�. ������ �ش� �ʵ���� ����Ѵ�.
	 * @param obj : record ��ü.
	 * @param fld : ��ȯ�� ��� �ʵ�.
	 * @param depth : ��尡 �Ҽӵ� ���� ����� id
	 * @param nodeName
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	private void makeFieldToNode(Object obj, 
					            Field fld, 
					            int depth, 
					            String nodeName) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String name = fld.getName();
		String type = fld.getType().getName();
		
		//�迭 ��ü�� �����Ѵ�.
		if("java.util.ArrayList".equals(type))
			return;
		
		if(nodeName!=null && !nodeName.trim().equals(""))
			name = nodeName;
		
		if("java.lang.String".equals(type))
			add(depth, name, replace((String)fld.get(obj)));
		else if("int".equals(type))
			add(depth, name, fld.getInt(obj));
		else if("long".equals(type))
			add(depth, name, fld.getLong(obj));
		else if("double".equals(type))
			add(depth, name, fld.getDouble(obj));
		else if("float".equals(type))
			add(depth, name, fld.getFloat(obj));
		else if("short".equals(type))
			add(depth, name, fld.getShort(obj));
		else
			add(depth, name, String.valueOf(fld.get(obj)));
	}
	
	/**
	 * record ��ü�� ���� �ʵ带 ��뷮 ������ ó���� ���ڿ��� �߰�. ���� �߰��� ��� �ش� �ʵ���� ���.
	 * @param obj : record ��ü
	 * @param fld : ��ȯ�� ��� �ʵ�.
	 * @param title : ���� �߰����� ����
	 * @param rowend : �ش� �ʵ尡 record�� ������ ������� ����.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	private void makeFieldToBulk(Object obj, 
	            Field fld, 
	            boolean title, 
	            boolean rowend) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String type = fld.getType().getName();
		
		//�迭 ��ü�� �����Ѵ�.
		if("java.util.ArrayList".equals(type))
			return;
		
		if(title)
		{
			if(rowend)
				add_RowVal(fld.getName());
			else
				add_ColVal(fld.getName());
		}
		else
		{
		
			if(rowend)
			{
				if("java.lang.String".equals(type))
					add_RowVal((String)fld.get(obj));
				else if("int".equals(type))
					add_RowVal(fld.getInt(obj));
				else if("long".equals(type))
					add_RowVal(fld.getLong(obj));
				else if("double".equals(type))
					add_RowVal(fld.getDouble(obj));
				else if("float".equals(type))
					add_RowVal(fld.getFloat(obj));
				else if("short".equals(type))
					add_RowVal(fld.getShort(obj));
				else
					add_RowVal(String.valueOf(fld.get(obj)));
			}
			else
			{
				if("java.lang.String".equals(type))
					add_ColVal((String)fld.get(obj));
				else if("int".equals(type))
					add_ColVal(fld.getInt(obj));
				else if("long".equals(type))
					add_ColVal(fld.getLong(obj));
				else if("double".equals(type))
					add_ColVal(fld.getDouble(obj));
				else if("float".equals(type))
					add_ColVal(fld.getFloat(obj));
				else if("short".equals(type))
					add_ColVal(fld.getShort(obj));
				else
					add_ColVal(String.valueOf(fld.get(obj)));
			}
		}
	}
	
	/**
	 * record ��ü�� �������� ��ȯ
	 * @param obj : record ��ü.
	 * @param depth : �θ� ����� id
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToXml(Object obj, int depth) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			for(int i=0; flds!=null && i<flds.length; i++)
			{
				makeFieldToNode(obj, flds[i], depth, null);
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset ��ü�� Ư�� record set�� �������� ��ȯ
	 * @param obj : dataset ��ü.
	 * @param arrName : ��ȯ�� record set�� �ʵ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ��� id
	 */
	public int makeDataToXml(Object obj, 
					          String arrName, 
					          int parentDepth, 
					          String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			ndepth = add(parentDepth, nodeTag, "");
			rdepth = 0;
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "record", "");
					makeRecordToXml(rec, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset ��ü ��ü�� ��뷮 ó���� ���� ���ڿ��� �߰�. dataset ��ü�� record ��ü�� ��ȯ�ϴ� ���� �ƴ϶� dataset��ü�� ����� ��ȯ.
	 * @param obj : dataset ��ü.
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ��� id
	 */
	public int makeDataToXml(Object obj, 
					          int parentDepth, 
					          String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			ndepth = add(parentDepth, nodeTag, "");
			makeRecordToXml(obj, ndepth);
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * record ��ü�� �̿��Ͽ� ��뷮 ó���� ���� ���ڿ��� title�� ����..
	 * @param obj : record ��ü
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToBulkTitle(Object obj) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			if(flds!=null)
			{
				for(int i=0; i<flds.length; i++)
				{
					makeFieldToBulk(obj, flds[i], true, i == flds.length-1);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
		
	/**
	 * record ��ü�� ��뷮 ó���� ���� ���ڿ��� �߰�.
	 * @param obj : record ��ü
	 * @param first : ��뷮 ó�� ���ڿ��� ó������ �߰��Ǵ� record���� ����. ù��°�� ��� �Ϻ� �ʵ� ����� �̸��� �߰��Ѵ�.
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToBulk(Object obj, boolean first) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		Field[] flds = obj.getClass().getFields();
		try{
			if(flds!=null)
			{
				if(first)
				{
					makeRecordToBulkTitle(obj);
				}
				for(int i=0; i<flds.length; i++)
				{
					makeFieldToBulk(obj, flds[i], false, i == flds.length-1);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset ��ü�� Ư�� record set�� ��뷮 ó���� ���� ���ڿ��� �߰�.
	 * @param obj : dataset ��ü
	 * @param arrName : ��ȯ�� record set�� �ʵ� ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToBulk(Object obj, 
					           String arrName, 
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "");
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);

			if(arr!=null && arr.size()>0)
			{
				add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
				startHuge();
			
				for(int i=0; arr!=null && i<arr.size(); i++)
				{
					Object rec = arr.get(i);
					if(rec != null)
					{
						makeRecordToBulk(rec, i==0);
					}
				}
			
				endHuge();
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset ��ü ��ü�� ��뷮 ó���� ���� ���ڿ��� �߰�. dataset ��ü�� record ��ü�� ��ȯ�ϴ� ���� �ƴ϶� dataset��ü�� ����� ��ȯ.
	 * @param obj : dataset ��ü
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToBulk(Object obj, 
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
	
		if(obj == null)
			return ndepth;
		
		setHugeSep(colSep, rowSep); 
		
		try{
			ndepth = add(parentDepth, nodeTag, "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
			
			startHuge();
		
			makeRecordToBulk(obj, true);
		
			endHuge();
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * �뷮 ������ ������ ����� ���� �ʱ� �۾�. record ��ü�� �ڵ� ������ �Ұ��� ���(������ ���� �ʿ�)�� ���.
	 * @param parentDepth
	 * @param nodeTag
	 */
	public void makeHugeStart(int parentDepth, String nodeTag)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		startHuge();
	}
	
	/**
	 * �뷮 ������ ������ ����� ���� �ʱ� �۾�. record ��ü�� �ڵ� ������ �Ұ��� ���(������ ���� �ʿ�)�� ���.
	 * ���� ���� �����Ͱ� ���� ���¿��� �� record�� �����Ǵ� ���� ���� ���� ���.
	 * �� record �� ���� ��� ��ȸ�� �ݺ��� �� (�����Ͱ� ���� ��ȸ ��, �����Ͱ� 1���� ��ȸ�� �ǽ��� �� 
	 * model.send(.., true)�� ���� �ʰ� Ư�� grid�� model�� refresh �ص� ȭ�鿡 �����Ͱ� ǥ�õ��� �ʴ� trustform ���� ����.
	 * @param parentDepth
	 * @param nodeTag
	 * @param dataSize : �� ������ ������. (ex. ds.arrayMember.size())
	 */
	public void makeHugeStart(int parentDepth, String nodeTag, int dataSize)
	{
		String rowSep = "|";
		String colSep = "^";
		int ndepth = 0;
		
		setHugeSep(colSep, rowSep); 
		ndepth = add(parentDepth, nodeTag, "");
		
		if(dataSize>0)
			add(ndepth, "record", "", "type=\"_huge_\" rowsep=\"" + rowSep +"\" colsep=\"" + colSep +"\"");
		
		startHuge();
	}
	
	/**
	 * �뷮 ������ ������ ����� ���� �۾�. record ��ü�� �ڵ� ������ �Ұ��� ���(������ ���� �ʿ�)�� ���.
	 */
	public void makeHugeEnd()
	{
		endHuge();
	}
	
	/**
	 * record ��ü�� �ʵ带 �̿��Ͽ� select �迭�� ����� item ����� ���� label, value ��带 ����.
	 * @param obj : record ��ü.
	 * @param labelField : label ���� ����� ��� �ʵ�
	 * @param valueField : value ���� ����� ��� �ʵ�
	 * @param depth : ���� item ����� id
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToList(Object obj, 
					             String labelField, 
					             String valueField, 
					             int depth) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		try{
			Field label = obj.getClass().getField(labelField);
			Field value = obj.getClass().getField(valueField);
			
			makeFieldToNode(obj, label, depth, "label");
			makeFieldToNode(obj, value, depth, "value");
		
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * record ��ü�� �ʵ带 �̿��Ͽ� select �迭�� ����� item ����� ���� label, value ��带 ����.
	 * @param obj : record ��ü.
	 * @param labelField : label ���� ����� ��� �ʵ�
	 * @param valueField : value ���� ����� ��� �ʵ�
	 * @param depth : ���� item ����� id
	 * @param labelTag : label ����� ����
	 * @param valueTag : value ����� ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public void makeRecordToList(Object obj, 
					             String labelField, 
					             String valueField, 
					             int depth,
					             String labelTag,
					             String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		if(obj == null)
			return;
		
		try{
			Field label = obj.getClass().getField(labelField);
			Field value = obj.getClass().getField(valueField);
			
			makeFieldToNode(obj, label, depth, labelTag);
			makeFieldToNode(obj, value, depth, valueTag);
		
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeRecordToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	/**
	 * dataset�� Ư�� record set�� �̿��Ͽ� select �迭�� ����� item ������ ����
	 * @param obj : dataset ��ü
	 * @param arrName : ��ȯ�� record set�� �ʵ� ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param labelField : label ���� ����� ����ʵ� ��.
	 * @param valueField : value ���� ����� ����ʵ� ��.
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			if(nodeTag==null || nodeTag.equals(""))
				ndepth = parentDepth;
			else
				ndepth = add(parentDepth, nodeTag, "");
			
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "item", "");
					makeRecordToList(rec, labelField, valueField, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset�� Ư�� record set�� �̿��Ͽ� select �迭�� ����� item ������ ����
	 * @param obj : dataset ��ü
	 * @param arrName : ��ȯ�� record set�� �ʵ� ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param labelField : label ���� ����� ����ʵ� ��.
	 * @param valueField : value ���� ����� ����ʵ� ��.
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @param recTag : record ����� ����
	 * @param labelTag : label ����� ����
	 * @param valueTag : value ����� ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(obj == null)
			return ndepth;
		try{
			if(nodeTag==null || nodeTag.equals(""))
				ndepth = parentDepth;
			else
				ndepth = add(parentDepth, nodeTag, "");
			
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, recTag, "");
					makeRecordToList(rec, labelField, valueField, rdepth, labelTag, valueTag);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset�� Ư�� record set�� �̿��Ͽ� select �迭�� ����� item ������ ����
	 * @param obj : dataset ��ü
	 * @param arrName : ��ȯ�� record set�� �ʵ� ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param labelField : label ���� ����� ����ʵ� ��.
	 * @param valueField : value ���� ����� ����ʵ� ��.
	 * @param java.lang.String : ��ü/���� item �� label
	 * @param java.lang.String : ��ü/���� item �� value
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(nodeTag==null || nodeTag.equals(""))
			ndepth = parentDepth;
		else
			ndepth = add(parentDepth, nodeTag, "");
		
		addSelectItem(ndepth, allItemLabel, allItemValue);
		
		if(obj == null)
			return ndepth;
		try{
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, "item", "");
					makeRecordToList(rec, labelField, valueField, rdepth);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * dataset�� Ư�� record set�� �̿��Ͽ� select �迭�� ����� item ������ ����
	 * @param obj : dataset ��ü
	 * @param arrName : ��ȯ�� record set�� �ʵ� ��. �ش� �ʵ�� �ݵ�� ArrayList type �̾�� ��.
	 * @param labelField : label ���� ����� ����ʵ� ��.
	 * @param valueField : value ���� ����� ����ʵ� ��.
	 * @param java.lang.String : ��ü/���� item �� label
	 * @param java.lang.String : ��ü/���� item �� value
	 * @param parentDepth : �θ� ��� id
	 * @param nodeTag : �߰��� ��� ������ root ����
	 * @param recTag : record ����� ����
	 * @param labelTag : label ����� ����
	 * @param valueTag : value ����� ����
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @return : int. ������ ����� id.
	 */
	public int makeDataToList(Object obj, 
					           String arrName, 
					           String labelField,
					           String valueField,
					           String allItemLabel,
					           String allItemValue,
					           int parentDepth, 
					           String nodeTag,
					           String recTag,
					           String labelTag,
					           String valueTag) throws IllegalArgumentException, IllegalAccessException, Exception
	{
		int ndepth = 0;
		int rdepth = 0;
		
		if(nodeTag==null || nodeTag.equals(""))
			ndepth = parentDepth;
		else
			ndepth = add(parentDepth, nodeTag, "");
		
		addSelectItem(ndepth, recTag, labelTag, valueTag, allItemLabel, allItemValue);
		
		if(obj == null)
			return ndepth;
		try{
			ArrayList arr = (ArrayList)obj.getClass().getField(arrName).get(obj);
			
			for(int i=0; arr!=null && i<arr.size(); i++)
			{
				Object rec = arr.get(i);
				if(rec != null)
				{
					rdepth = add(ndepth, recTag, "");
					makeRecordToList(rec, labelField, valueField, rdepth, labelTag, valueTag);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the object is not an instance of the class or interface");
			e.printStackTrace();
			throw e;
		}catch(IllegalAccessException e){
			System.out.println("[RwXmlWrapper::makeDataToXml] the field is inaccessible");
			e.printStackTrace();
			throw e;
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return ndepth;
	}
	
	/**
	 * �� item �ϳ��� ������ ����Ʈ ��带 �����Ѵ�.
	 * �� item �� ���� ������ �� �ִ�.
	 * @param depth
	 * @param nodeName
	 * @param allItemLabel
	 * @param allItemValue
	 * @return
	 */
	public int makeEmpytList(int depth, String nodeName, String allItemLabel, String allItemValue)
	{
		int parent = makeParentNode(depth, nodeName);
		
		addSelectItem(parent, allItemLabel, allItemValue);
		
		return parent;
	}
	
	/**
	 * �� item �ϳ��� ������ ����Ʈ ��带 �����Ѵ�.
	 * �� item �� item, label, value node��� �� ���� ������ �� �ִ�.
	 * @param depth
	 * @param nodeName
	 * @param recordName
	 * @param labelName
	 * @param valuName
	 * @param allItemLabel
	 * @param allItemValue
	 * @return
	 */
	public int makeEmpytList(int depth, String nodeName, String recordName, String labelName, String valuName, String allItemLabel, String allItemValue)
	{
		int parent = makeParentNode(depth, nodeName);
		
		addSelectItem(parent, recordName, labelName, valuName, allItemLabel, allItemValue);
		
		return parent;
	}
	
	/**
	 * value�� ���� �� ��带 ����.
	 * @param depth : �θ� ��� id
	 * @param nodeName : ������ ����
	 * @return : ������ ����� id
	 */
	public int makeEmptyNode(int depth, String nodeName)
	{
		return add(depth, nodeName, "");
	}
	
	/**
	 * ������ ������ ��� ������ parent ��带 ����. ���� ���� �� ��尡 �����ȴ�.
	 * @param depth : �θ� ��� id
	 * @param nodeName : ������ ����
	 * @return : ������ ����� id
	 */
	public int makeParentNode(int depth, String nodeName)
	{
		return makeEmptyNode(depth, nodeName);
	}
	
	/**
	 * list�� ���� ��忡 item ��带 �߰��Ѱ� label�� value parameter�� ������ item ����� ������ label, value ��带 �Բ� �����Ѵ�.
	 * @param depth : item ��带 �߰��� �θ� ��� id
	 * @param label : item ��忡 �߰��� label ����� ��.
	 * @param value : item ��忡 �߰��� value ����� ��.
	 */
	public void addSelectItem(int depth, String label, String value)
	{
		int item = makeEmptyNode(depth, "item");
		
		add(item, "label", label==null ? "" : label);
		add(item, "value", value==null ? "" : value);
	}
	
	/**
	 * list�� ���� ��忡 record���� ��带 �߰��ϰ� label�� value parameter�� ������ item ����� ������带 �Բ� �����Ѵ�.
	 * @param depth : item ��带 �߰��� �θ� ��� id
	 * @param label : item ��忡 �߰��� label ����� ��.
	 * @param value : item ��忡 �߰��� value ����� ��.
	 */
	public void addSelectItem(int depth, String recordName, String labelName, String valuName, String label, String value)
	{
		int item = makeEmptyNode(depth, recordName);
		
		add(item, labelName, label==null ? "" : label);
		add(item, valuName, value==null ? "" : value);
	}
	
	/**
	 * ���� ���� ó��.
	 * @param errCode
	 * @param errMsg
	 * @return
	 */
	public int setErrorMessage(String errCode, String errMsg)
	{
		int msg = add(rootNodeID, "errData", "");
		add(msg, "errcode", errCode);
		add(msg, "errmsg", errMsg);
		
		return msg;
	}
	
	/**
	 * ���� �޽��� ó��.
	 * @param status
	 * @param message
	 * @return
	 */
	public int setReturnMessage(String status, String message)
	{
		int msg = add(rootNodeID, "msgData", "");
		add(msg, "statusMsg", status);
		add(msg, "resultMsg", message);
		
		return msg;
	}
	
	/**
	 * ���� ����ó��. error code�� "ERROR"
	 * @param message
	 * @return
	 */
	public int setErrorAlert(String message)
	{
		return setErrorMessage("ERROR", message);
	}
	
	/**
	 * ���� �޽���ó��. message code�� "OK" 
	 * @param message
	 * @return
	 */
	public int setMessageAlert(String message)
	{
		return setReturnMessage("OK", message);
	}
}
