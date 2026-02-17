FROM python:3.11-slim

WORKDIR /app
ARG HTTP_PROXY
ARG HTTPS_PROXY
ARG NO_PROXY

ENV HTTP_PROXY=${HTTP_PROXY}
ENV HTTPS_PROXY=${HTTPS_PROXY}
ENV NO_PROXY=${NO_PROXY}

RUN pip install --no-cache-dir streamlit

COPY myapp.py .

EXPOSE 8701

CMD ["streamlit", "run", "myapp.py", "--server.port=8701", "server.address=0.0.0.0"]
