package org.jboss.windup.config.xml;

import java.util.LinkedList;
import java.util.List;

import org.jboss.windup.config.base.BaseAction;
import org.jboss.windup.graph.model.resource.XmlResource;

public class XmlAction<T extends XmlResource> extends BaseAction<T> {
	
	protected List<NamespacePrefix> namespacePrefixes;
	
	public XmlAction() {
		this.namespacePrefixes = new LinkedList<NamespacePrefix>();
	}
	
	public List<NamespacePrefix> getNamespacePrefixes() {
		return namespacePrefixes;
	}
	
	public void setNamespacePrefixes(List<NamespacePrefix> namespacePrefixes) {
		this.namespacePrefixes = namespacePrefixes;
	}

	@Override
	public String toString() {
		return "XmlAction [namespacePrefixes=" + namespacePrefixes + ", condition=" + condition + ", actions=" + actions + "]";
	}

	

	
}
