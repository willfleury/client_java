# Environment Notes

This containerized environment runs inside a Kata Containers micro-VM backed by Cloud Hypervisor. Key evidence includes the kernel boot parameters targeting `kata-containers.target`, virtio-fs mounts labeled `kataShared`, and DMI strings reporting `Cloud Hypervisor`.

Outbound HTTP and HTTPS traffic is routed through an Envoy MITM proxy exposed at `http://proxy:8080`. Trust is established via the shared certificate located at `/usr/local/share/ca-certificates/envoy-mitmproxy-ca-cert.crt`, referenced by multiple environment variables such as `SSL_CERT_FILE`, `REQUESTS_CA_BUNDLE`, and `NODE_EXTRA_CA_CERTS`.

No Codex CLI authentication credentials (API keys or tokens) are preconfigured in the environment. Any Codex CLI usage would require supplying credentials manually or leveraging an external authentication mechanism.
